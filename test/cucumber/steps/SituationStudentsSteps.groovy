package steps

import cucumber.api.PendingException
import pages.AddStudentsPage


/**
 * Created by lavin on 29/11/2016.
 */

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^o aluno "([^"]*)", com login "([^"]*)", possui conceitos "([^"]*)", "([^"]*)" e "([^"]*)" em "([^"]*)"$/) { String arg1, String arg2, String arg3, String arg4, String arg5, String arg6 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
And(~/^o aluno "([^"]*)", possui media "([^"]*)" em "([^"]*)"$/) { String arg1, String arg2, String arg3 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
When(~/^eu solicito a situação do aluno "([^"]*)"$/) { String arg1 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Then(~/^a média de "([^"]*)" em "([^"]*)" continua sendo "([^"]*)"$/) { String arg1, String arg2, String arg3 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Given(~/^o aluno "([^"]*)", com login "([^"]*)", possui média "([^"]*)" em "([^"]*)"$/) {
    String nome, String login, String media, String conceito ->
    to AddStudentsPage
    at AddStudentsPage
    page.fillStudentDetails(nome,login)
}
When(~/^eu solicito a página "([^"]*)"$/) { String arg1 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Then(~/^a média do aluno "([^"]*)" em "([^"]*)" aparece verde e com uma seta para cima$/) { String arg1, String arg2 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}