package com.kcs.auto.adverts.service.impl;

import com.kcs.auto.adverts.service.AdvertsService;
import com.kcs.auto.adverts.service.ConnectionServices;
import com.kcs.auto.adverts.vo.Advert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dalius on 2017.03.09.
 */
public class AdvertsServiceImpl implements AdvertsService{
    @Override
    public List<Advert> getAdverts() {
        List<Advert> adverts = new ArrayList<>();
        ConnectionServices connectionServices = new ConnectionServiceImpl();
        Connection connection = connectionServices.createConnection();

        if(connection != null){
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from adverts");
                while (resultSet.next()){

                    Advert advert = new Advert(resultSet.getInt(1 ),
                            resultSet.getBigDecimal(2),
                            resultSet.getString(3),
                            resultSet.getDate(4),
                            resultSet.getString(5),
                            resultSet.getDate(6),
                            resultSet.getString(7),
                            resultSet.getString(8),
                            resultSet.getString(9));
                    adverts.add(advert);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return adverts;
    }
}
