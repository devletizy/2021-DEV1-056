package com.test.morpion.ui.views.list;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.test.morpion.ui.MainLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import lombok.extern.log4j.Log4j2;


@Component
@Scope("prototype")
@Route(value = "", layout = MainLayout.class)
@PageTitle("Tic Tac Toc | Morpion")
@Log4j2
public class ListView extends VerticalLayout {
    
	public ListView() {
        addClassName("list-view");
        setSizeFull();
        
        Div content = new Div();
        content.addClassName("content");
        content.setSizeFull();
    }

 

}
