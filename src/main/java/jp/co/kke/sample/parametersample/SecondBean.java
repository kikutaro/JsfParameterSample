package jp.co.kke.sample.parametersample;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "secondBean")
@ViewScoped
public class SecondBean implements Serializable{

    @Getter @Setter
    @Inject
    private ParameterBean param;
    
    @PostConstruct
    public void init(){
        System.out.println(param.getParam());
    }
}
