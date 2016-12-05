package pages

import geb.Page
/**
 * Created by lavinia on 25/11/2016.
 */
class SituationStudentPage extends Page{
    static url = "/TA/situationStudents/index"

    static at =  {
        title ==~ /Create property List/
        //title ==~ /Create property Listagem/
    }

    boolean media(aluno, conceito, color){
        def x = aluno + "+" + conceito
        assert $("td", id:x)!= null
        if( color == "verde" && $('.green').attr('id').equals(x)){
            return true
        }

        if(color == "vermelho" && $('.red').attr('id').equals(x)){
            return true
        }
    }
}
