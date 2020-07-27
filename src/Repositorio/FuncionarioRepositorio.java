/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramom
 */
public class FuncionarioRepositorio {
    private static List<Funcionario> funcionarios;
    
     public FuncionarioRepositorio(){
        if(funcionarios == null){
            funcionarios = new ArrayList<Funcionario>();
        }
    }
}
