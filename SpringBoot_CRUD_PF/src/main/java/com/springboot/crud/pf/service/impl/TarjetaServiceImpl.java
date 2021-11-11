package com.springboot.crud.pf.service.impl;

import com.springboot.crud.pf.bean.TarjetaBean;
import com.springboot.crud.pf.model.Tarjeta;
import com.springboot.crud.pf.repository.TarjetaRepository;
import com.springboot.crud.pf.service.TarjetaService;
import com.springboot.crud.pf.utils.Utils;
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
