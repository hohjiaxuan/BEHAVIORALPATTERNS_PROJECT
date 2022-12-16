/*
STUDENT ID     : B221202904
NAME           : HOH
SURNAME        : JIA XUAN
COURSE CODE    : SWE 303
COURSE NAME    : DESIGN PATTERNS
ASSIGNMENT     : PROJECT
SUMMARY        : Chain of Responsibility is one of the behavioral design patterns.
                 It avoids coupling the sender of request to its receiver by giving more than one object a chance to handle the request.
                 Chain the receiving objects and pass the request along the chain until an object handles it.
                 Furthermore, it launches and leaves requests with a single processing pipeline that contains many possible handlers.
                 Also, the object-oriented linked list with recursive traversal.
*/

class ChainOfResponsibilityExample {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            SupportCenterClient.handlerChain.apply {
                println(".....")
                receiveRequest(AbstractSupportCenter.Constants.GENERAL, "Here are General Issues!")
                println(".....")
                receiveRequest(AbstractSupportCenter.Constants.TECHNICAL, "Here are Technical Issues!")
                println(".....")
                receiveRequest(AbstractSupportCenter.Constants.ADVANCE, "Here are Advance Issues!")
                println(".....")
            }

        }

    }

}



