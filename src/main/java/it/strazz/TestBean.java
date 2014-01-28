package it.strazz;
 
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Components;

@ManagedBean(name="test")
@SessionScoped
public class TestBean implements Serializable{
 
	private static final long serialVersionUID = 1L;

	public void add(ActionEvent event){
		Components.includeCompositeComponent(Components.findComponent("myForm"), "strazz", "test.xhtml", FacesContext.getCurrentInstance().getViewRoot().createUniqueId());
	}
	
}