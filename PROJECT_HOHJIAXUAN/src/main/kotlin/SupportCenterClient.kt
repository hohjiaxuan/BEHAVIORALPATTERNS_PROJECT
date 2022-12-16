object SupportCenterClient {
    val handlerChain: AbstractSupportCenter
        get() {
            val general = GeneralSupportCenter(AbstractSupportCenter.Constants.GENERAL)
            val technical = TechnicalSupportCenter(AbstractSupportCenter.Constants.TECHNICAL)
            val advance = AdvanceSupportCenter(AbstractSupportCenter.Constants.ADVANCE)

            //Assign the next handler for the [GeneralSupportCenter]
            general.nextHandler(technical)

            //Assign the next handler for the [TechnicalSupportCenter]
            technical.nextHandler(advance)
            return general
        }

}

