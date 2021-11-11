package com.springboot.crud.poo.service.impl;

import com.springboot.crud.poo.bean.TarjetaBean;
import com.springboot.crud.poo.model.Tarjeta;
import com.springboot.crud.poo.repository.TarjetaRepository;
import com.springboot.crud.poo.service.TarjetaService;
import com.springboot.crud.poo.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarjetaServiceImpl implements TarjetaService {

    @Autowired
    TarjetaRepository tarjetaRepository;

    @Override
    public TarjetaBean createCard(Tarjeta tarjeta) {
        Tarjeta cardSaved = tarjetaRepository.save(tarjeta);
        TarjetaBean cardBean = Utils.cardEntityToCardBean(cardSaved);
        return cardBean;
    }

}
