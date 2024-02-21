package com.example.workflow;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class MyBean implements  ExecutionListener {
    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        System.out.println(delegateExecution.getVariableNames());
        System.out.println(delegateExecution.getVariable("myInput"));
    }
}
