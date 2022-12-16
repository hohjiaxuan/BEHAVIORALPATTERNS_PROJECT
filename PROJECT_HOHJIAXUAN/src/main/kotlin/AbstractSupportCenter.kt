abstract class AbstractSupportCenter(private val _level: Int) {

    object Constants {
        //Constants for Priority
        val GENERAL: Int = 1
        val TECHNICAL: Int = 2
        val ADVANCE: Int = 3
    }

    //Store the next handler to pass request to the next handler
    private var nextHandler: AbstractSupportCenter? = null

    open fun nextHandler(handler: AbstractSupportCenter) {
        this.nextHandler = handler
    }

    open fun receiveRequest(level: Int, message: String) {
        when (this._level <= level) {
            true -> handleRequest(message)
            else -> nextHandler?.receiveRequest(level, message)
                ?: kotlin.run { println("Next handler not found to handle this request.") }
        }
    }

    protected abstract fun handleRequest(message: String)
}

    class GeneralSupportCenter(level: Int) : AbstractSupportCenter(level) {
        override fun handleRequest(message: String) {
            println("GeneralSupportCenter: Processing request $message")
        }
    }

    class TechnicalSupportCenter(level: Int) : AbstractSupportCenter(level) {
        override fun handleRequest(message: String) {
            println("TechnicalSupportHandler: Processing request $message")
        }
    }

    class AdvanceSupportCenter(level: Int) : AbstractSupportCenter(level) {
        override fun handleRequest(message: String) {
            println("AdvanceSupportCenter: Processing request $message")
        }
    }
