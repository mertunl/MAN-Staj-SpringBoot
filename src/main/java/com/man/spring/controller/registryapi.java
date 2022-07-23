package com.man.spring.controller;

import com.man.spring.model.Registry;
import com.man.spring.service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller

public class registryapi {
    @Autowired
    RegistryService userService;

    @RequestMapping(value = "/registry",method = RequestMethod.GET)
    public String registerPage(Registry registry, Model model){


        List<String> kayitList = Arrays.asList("1-Eksik Proses", "2-İlave Üretilen Tesisatlar", "3-Man Denge İlave Sök-Tak İşçilikler", "4-Üretim&SL Kulüp Tekrarlı Konular");
        List<String> ldSorumlusuList = Arrays.asList("İş Hazırlama(M.Sinan Savaş-Hasancan Güzey-Mevlüt Akkaya-Mustafa Yer)",
                "İlk Num. ve Malz. Kontrol(Uğur Atay)",
                "Teknik(Hazel Abadan)",
                "Lojistik(Belgin İşleyen)");
        List<String> tesisatNoList = Arrays.asList("YOK");
        List<String> bildirenBolumList = Arrays.asList("İskelet&Dış Saclama",
                "Boyahane","Mekanik Montaj","Montaj","Araç Bitiş","Kablo","İş Hazırlama","İlk Num. ve Malz. Kontrol");
        List<String> mesaiList = Arrays.asList("EVET","HAYIR");
        List<String> saseNoList = Arrays.asList("A782020","12C4356","P061278");

        model.addAttribute("kayitList",kayitList);
        model.addAttribute("bildirenBolumList",bildirenBolumList);
        model.addAttribute("ldSorumlusuList", ldSorumlusuList);
        //model.addAttribute("aciklama",registry.getAciklama());
        model.addAttribute("saseNoList",saseNoList);
        //model.addAttribute("taracSayi",registry.getTaracSayi());
        model.addAttribute("mesaiList",mesaiList);
        model.addAttribute("tesisatNoList", tesisatNoList);
        //model.addAttribute("tesisatNo",registry.getTesisatNo());
        //model.addAttribute("adaptasyonNo",registry.getAdaptasyonNo());
        /*model.addAttribute("taracSure",registry.getTaracSayi());
        model.addAttribute("parcaNo",registry.getParcaNo());
        model.addAttribute("taracSayi",registry.getSaseNo());
        model.addAttribute("aracbasiSure",registry.getAracbasiSure());
        model.addAttribute("tSure",registry.gettSure());
        model.addAttribute("adaptasyonNo",registry.getAdaptasyonNo());*/

        return "registerform";
    }

    @RequestMapping(value = "/registerform", method = RequestMethod.POST)
    public String saveRegisterPage(@Valid @ModelAttribute("registry") Registry registry, BindingResult result, Model model) {
        model.addAttribute("registry", registry);

        userService.save(registry);


        return "registerform";
    }






}
