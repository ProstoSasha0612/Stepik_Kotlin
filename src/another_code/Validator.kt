package another_code

import kotlin.reflect.KClass

interface FieldValidator<in T>{
    fun validate(input:T):Boolean
}

object DefaultStringValidator:FieldValidator<String>{
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator:FieldValidator<Int>{
    override fun validate(input: Int) = input >=0
}

object Validators{
    private val validators = mutableMapOf<KClass<*>,FieldValidator<*>>() //private, чтобы нельзя было неправильную пару ключ-значение добавлять

    fun <T:Any> registerValidator(kClass: KClass<T>,fieldValidator: FieldValidator<T>){ // можно добавлять только пару ключ значение когда
        validators[kClass] = fieldValidator                                             //валидатор соответствует значению
    }

    operator fun <T : Any> get(kClass: KClass<T>): FieldValidator<T> {
        return validators[kClass] as? FieldValidator<T>
            ?: throw IllegalArgumentException("No validator for ${kClass.simpleName}")
    }
}
