package so;

import so.process.PriorityEnum;
import so.process.SoProcess;
import so.systemSo.SystemCallType;
import so.systemSo.SystemOperation;

public class Execute {
    public static void main(String[] args) {
    	
    	//Teste pagina faltando para alocação do frame memory
//        SoProcess process1 = SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 130, null);
//        SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, process1);
//        SoProcess process2 = SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 90, null);
//        SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, process2);
//        SoProcess process3 = SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 34, null);
//        SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, process3);
       
    	
    	//FCFS	
        SoProcess process1 = SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 130, null);
        SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, process1);
        SoProcess process2 = SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 90, null);
        SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, process2);
        SoProcess process3 = SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 30, null);
        SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, process3);

   
        
    }
}

