package com.example.petshelterg2.constants;

/**
 * Хранит все письменные данные и emoji в виде публичных констант
 */
public class Constants {
    public static final String ERROR_TEXT = "Error occurred: ";
    // emoji
    public final static String BLUSH_EMOJI = "\uD83D\uDE0A";
    public final static String CAT_EMOJI = "\uD83D\uDE3A";
    public final static String DOG_EMOJI = "🐶";
    public final static String VOLUNTEER_EMOJI = "\uD83D\uDE4B";
    public final static String SCHEDULE_EMOJI = "⏰";
    public final static String GUARD_EMOJI = "\uD83D\uDC6E";
    public final static String SHELTER_EMOJI = "\uD83C\uDFEC";
    public final static String PHONE_EMOJI = "\uD83D\uDCDE";
    public final static String BACK_EMOJI = "⏩";
    public final static String HOME_EMOJI = "\uD83C\uDFDA";
    public final static String SAVE_EMOJI = "\uD83D\uDCBE";

    // messages
    public final static String GREETING_PLUS_SELECT_SHELTER_TEXT_START =
            "Привет!" + BLUSH_EMOJI + " \n " +
                    "\n " +
                    "Я бот приюта для домашних животных! \n " +
                    "\n " +
                    "Моя цель - внести в твой мир хаос, " +
                    "суету и бессонные ночи, а точнее - " +
                    "помочь тебе забрать мохнатого из приюта! \n" +
                    "\n " +
                    "Я с радостью предоставлю информацию о приюте, " +
                    "дам советы по уходу за мохнатым, " +
                    "расскажу как забрать ушастого из приюта, " +
                    "а также помогу с ежедневными отчётами \n" +
                    "\n " +
                    " Для начала выбери приют: ";
    public final static String GREETING_PLUS_SELECT_SHELTER_TEXT = "Снова здравствуйте, %s, выберите приют, ваc ждет питомец!" + " " + BLUSH_EMOJI;
    public final static String CAT_SHELTER_SELECT_TEXT = "Вы выбрали приют для кошек" + " " + CAT_EMOJI + " " + " чем мы можем помочь? ";
    public final static String DOG_SHELTER_SELECT_TEXT = "Вы выбрали приют для собак" + " " + DOG_EMOJI + " " + " чем мы можем помочь? ";
    public final static String ABOUT_CAT_SHELTER_TEXT = "Деятельность центра помощи бездомным животным в первую очередь — это спасение бездомных животных, оказание им медицинской помощи, в которой большинство бездомных собак и кошек нуждаются. " +
            "Шансов выжить на улице у бездомных животных очень мало. " +
            "В наших силах дать возможность жить, быть сытым, иметь крышу над головой и тёплую будку для каждого животного.";
    public final static String ABOUT_DOG_SHELTER_TEXT = "Деятельность центра помощи в первую очередь — это спасение бездомных животных, оказание им медицинской помощи, в которой большинство бездомных собак и кошек нуждаются. " +
            "Шансов выжить на улице у бездомных животных очень мало. " +
            "В наших силах дать возможность жить, быть сытым, иметь крышу над головой и тёплую будку для каждого животного.";
    public final static String CAT_TAKING_ANIMAL_FROM_SHELTER = "Чтобы взять животное из приюта сначала ознакомьтесь с правилами, списком документов, а также с рекомендациями";
    public final static String DOG_TAKING_ANIMAL_FROM_SHELTER = "Чтобы взять животное из приюта сначала ознакомьтесь с правилами, списком документов, а также с рекомендациями";
    public final static String CAT_SHELTER_WORK_SCHEDULE = "Время работы: ежедневно с 9.00 до 21.00 без перерывов, выходных и праздничных дней.\n" +
            "\n" +
            "Адрес: Москва, ул. Осташковская, д. 14 стр. 2. На территории имеется парковка, стоимостью 100,00 рублей.";
    public final static String DOG_SHELTER_WORK_SCHEDULE = "Время работы: ежедневно с 9.00 до 21.00 без перерывов, выходных и праздничных дней.\n" +
            "\n" +
            "Адрес: \n" +
            "Москва, ул. Искры, д. 23а. На территории имеется парковка, стоимостью 100,00 рублей.";
    public final static String CAT_SHELTER_SECURITY_CONTACTS = "Телефон: 8 (495) 111-11-11\n" +
            "\n" +
            "(!) Обязательно захватите с собой паспорт, на территории действует пропускная система. " +
            "Документ, удостоверяющий личность, должен быть у каждого посетителя. С проходной позвоните нам со стационарного телефона по номеру 343, мы закажем вам пропуск.";
    public final static String DOG_SHELTER_SECURITY_CONTACTS = "Телефон: 8 (495) 000-00-00\n" +
            "\n" +
            "(!) Обязательно захватите с собой паспорт, на территории действует пропускная система. " +
            "Документ, удостоверяющий личность, должен быть у каждого посетителя. С проходной позвоните нам со стационарного телефона по номеру 343, мы закажем вам пропуск.";
    public final static String SAFETY_NOTES_DOG = "   В приют не допускаются:\n" +
            "\n" +
            "•дети до 16 лет без сопровождения взрослых (родителей, опекунов, представителей с предъявленной рукописной доверенностью);\n" +
            "•лица в состоянии алкогольного или наркотического опьянения;\n" +
            "•лица в агрессивном или неадекватном состоянии.\n" +
            "   \nДля всех посетителей Приюта запрещается:\n" +
            "\n" +
            "•проведение фото и видео фиксации без предварительного письменного согласования с администрацией Приюта за 3 рабочих дня до планируемого проведения фото или видео фиксации;\n" +
            "•кормить животных кормами и продуктами, как на территории Приюта, так и во время выгула вне границ территории Приюта без согласования с администрацией Приюта и ветеринарным врачом Приюта;\n" +
            "•посещать блок карантина и изолятор;\n" +
            "•без необходимости находиться вблизи вольеров;\n" +
            "•давать животным самостоятельно какие-либо ветеринарные или медицинские препараты;\n" +
            "•осуществлять любые ветеринарные манипуляции с животными;\n" +
            "•во время выгула собак допускать ситуации, влекущие за собой, как следствие стрессовое состояние собак, в том числе и остающихся в вольерах, а именно: лая, агрессивного и нервного состояния, и другого проявления беспокойства, которое может отразиться на психике собак и затруднить работу сотрудников приюта, а также вызвать покусы, конфликты и драки между собаками.\n" +
            "•выгуливать за пределами территории приюта одновременно более двух собак;\n" +
            "•выгуливать животных без поводка (в местах скопления людей одевать намордник);\n" +
            "•находится без сопровождения сотрудника на территории приюта;\n" +
            "•посещать приют со своими животными.\n" +
            "   \nПередача животного сотрудником Приюта посетителю для выгула осуществляется на специально отведенной территории.\n" +
            "\n" +
            "•выдача животных сотрудниками Приюта посетителям осуществляется в порядке живой очереди;\n" +
            "•время выдачи животного сотрудниками Приюта посетителям для выгула не должно превышать 25 минут.\n" +
            "   \nПри первичном посещении Приюта, в целях безопасности, гостю запрещается без сопровождения ответственного рабочего по уходу за животными:\n" +
            "\n" +
            "•заходить в вольеры с животными;\n" +
            "•кормить и гладить животных;\n" +
            "•выпускать животных из вольеров;\n" +
            "•выходить с животными за территорию приюта.";
    public final static String SAFETY_NOTES_CAT = "   В приют не допускаются:\n" +
            "\n" +
            "•дети до 16 лет без сопровождения взрослых (родителей, опекунов, представителей с предъявленной рукописной доверенностью);\n" +
            "•лица в состоянии алкогольного или наркотического опьянения;\n" +
            "•лица в агрессивном или неадекватном состоянии.\n" +
            "   \nДля всех посетителей Приюта запрещается:\n" +
            "\n" +
            "•проведение фото и видео фиксации без предварительного письменного согласования с администрацией Приюта за 3 рабочих дня до планируемого проведения фото или видео фиксации;\n" +
            "•кормить животных кормами и продуктами, как на территории Приюта, так и во время выгула вне границ территории Приюта без согласования с администрацией Приюта и ветеринарным врачом Приюта;\n" +
            "•посещать блок карантина и изолятор;\n" +
            "•без необходимости находиться вблизи вольеров;\n" +
            "•давать животным самостоятельно какие-либо ветеринарные или медицинские препараты;\n" +
            "•осуществлять любые ветеринарные манипуляции с животными;\n" +
            "•во время выгула собак допускать ситуации, влекущие за собой, как следствие стрессовое состояние собак, в том числе и остающихся в вольерах, а именно: лая, агрессивного и нервного состояния, и другого проявления беспокойства, которое может отразиться на психике собак и затруднить работу сотрудников приюта, а также вызвать покусы, конфликты и драки между собаками.\n" +
            "•выгуливать за пределами территории приюта одновременно более двух собак;\n" +
            "•выгуливать животных без поводка (в местах скопления людей одевать намордник);\n" +
            "•находится без сопровождения сотрудника на территории приюта;\n" +
            "•посещать приют со своими животными.\n" +
            "   \nПри первичном посещении Приюта, в целях безопасности, гостю запрещается без сопровождения ответственного рабочего по уходу за животными:\n" +
            "\n" +
            "•заходить в вольеры с животными;\n" +
            "•кормить и гладить животных;\n" +
            "•выпускать животных из вольеров;\n" +
            "•выходить с животными за территорию приюта.";
    public final static String RULES_FOR_FIRST_MET = "Правила знакомства с животным до того, как забрать его из приюта";
    public final static String LIST_OF_DOCUMENTS_FOR_ADOPTION = "Список документов, необходимых для того, чтобы взять животное из приюта";
    public final static String TRANSPORTING_RECOMMENDATIONS = "Список рекомендаций по транспортировке животного";
    public final static String ARRANGING_HOME_RECOMMENDATIONS_YOUNG = "Список рекомендаций по обустройству дома для щенка/котенка";
    public final static String ARRANGING_HOME_RECOMMENDATIONS_ADULT = "Список рекомендаций по обустройству дома для взрослого животного";
    public final static String ARRANGING_HOME_RECOMMENDATIONS_DISABLED = "Список рекомендаций по обустройству дома для животного с ограниченными возможностями (зрение, передвижение)";
    public final static String INITIAL_DOG_HANDLER_ADVICE = "Советы кинолога по первичному общению с собакой";
    public final static String DOG_HANDLER_RECOMMENDATION = "Рекомендации по проверенным кинологам для дальнейшего обращения к ним";
    public final static String REFUSAL_REASONS_LIST = "Список причин, почему могут отказать и не дать забрать собаку из приюта";
    public final static String VOLUNTEER_MESSAGE = "Пользователю требуется помощь! \n t.me/";
    public final static String SAVE_ADMIN = "Сохранить админа";
    public final static String VOLUNTEER_WILL_WRITE_TO_YOU = "Волонтёр получил уведомление и скоро вам напишет!";
    public final static String DATA_SAVED = "Данные сохранены" + " " + SAVE_EMOJI;
    //buttons
    public final static String MAIN_MAIN = "Вернуться в главное меню" + " " + BACK_EMOJI;
    public final static String CAT_SHELTER_BUTTON = "Приют для кошек" + " " + CAT_EMOJI;
    public final static String DOG_SHELTER_BUTTON = "Приют для собак" + " " + DOG_EMOJI;
    public final static String SHELTER_SECOND_STEP_BUTTON_DOG = "Как взять животное из приюта" + DOG_EMOJI;
    public final static String SHELTER_THIRD_STEP_BUTTON_DOG = "Прислать отчет о питомце" + DOG_EMOJI;
    public final static String SHELTER_SECOND_STEP_BUTTON_CAT = "Как взять животное из приюта" + CAT_EMOJI;
    public final static String SHELTER_THIRD_STEP_BUTTON_CAT = "Прислать отчет о питомце" + CAT_EMOJI;
    public final static String CALL_VOLUNTEER_BUTTON = "Позвать волонтера" + " " + VOLUNTEER_EMOJI;
    public final static String ABOUT_SHELTER_BUTTON_CAT = "Информация о приюте кошек" + " " + SHELTER_EMOJI;
    public final static String SHELTER_SCHEDULE_BUTTON_CAT = "Адрес и график работы приюта кошек" + " " + SCHEDULE_EMOJI;
    public final static String SECURITY_CONTACTS_BUTTON_CAT = "Контакты охраны приюта кошек" + " " + GUARD_EMOJI;
    public final static String SAFETY_NOTES_BUTTON_CAT = "Техника безопасности в приюте кошек";
    public final static String ABOUT_SHELTER_BUTTON_DOG = "Информация о приюте собак" + " " + SHELTER_EMOJI;
    public final static String SHELTER_SCHEDULE_BUTTON_DOG = "Адрес и график работы приюта собак" + " " + SCHEDULE_EMOJI;
    public final static String SECURITY_CONTACTS_BUTTON_DOG = "Контакты охраны приюта собак" + " " + GUARD_EMOJI;
    public final static String RULES_FOR_GETTING_KNOW_DOG = "Правила знакомства с " + " " + DOG_EMOJI;
    public final static String RULES_FOR_GETTING_KNOW_CAT = "Правила знакомства с " + " " + CAT_EMOJI;
    public final static String LIST_DOCUMENTS_TAKE_ANIMAL_DOG = "Список документов, чтобы взять" + " " + DOG_EMOJI;
    public final static String LIST_DOCUMENTS_TAKE_ANIMAL_CAT = "Список документов, чтобы взять" + " " + CAT_EMOJI;
    public final static String RECOMMENDATIONS_TRANSPORTATION_CAT = "Рекомендаций по транспортировке" + " " + CAT_EMOJI;
    public final static String RECOMMENDATIONS_TRANSPORTATION_DOG = "Рекомендаций по транспортировке" + " " + DOG_EMOJI;
    public final static String RECOMMENDATIONS_HOME_BUTTON1_CAT = "Pекомендации по обустройству дома" + " " + CAT_EMOJI;
    public final static String RECOMMENDATIONS_HOME_BUTTON1_DOG = "Рекомендации по обустройству дома" + " " + DOG_EMOJI;
    public final static String RECOMMENDATIONS_HOME_BUTTON2_CAT = "Pекомендации по обустройству " + HOME_EMOJI + " для котенка" + CAT_EMOJI;
    public final static String RECOMMENDATIONS_HOME_BUTTON2_DOG = "Рекомендации по обустройству " + HOME_EMOJI + " для щенка " + DOG_EMOJI;
    public final static String RECOMMENDATIONS_HOME_KITTY = "Pекомендации по обустройству " + HOME_EMOJI + " для взрослого" + CAT_EMOJI;
    public final static String RECOMMENDATIONS_HOME_PUPPY = "Рекомендации по обустройству " + HOME_EMOJI + " для взрослого " + DOG_EMOJI;
    public final static String RECOMMENDATIONS_HOME_CAT_WITH_DISABILITIES = "Pекомендации по обустройству " + HOME_EMOJI + " для " + CAT_EMOJI + " c ограниченными возможностями";
    public final static String RECOMMENDATIONS_HOME_DOG_WITH_DISABILITIES = "Рекомендации по обустройству " + HOME_EMOJI + " для " + DOG_EMOJI + " c ограниченными возможностями";
    public final static String TIPS_DOG_HANDLER_AND_WHY_THEY_MAY_REFUSE_TAKE_ANIMAL = "Советы кинолога и почему вам могут отказать " + DOG_EMOJI;
    public final static String TIPS_DOG_HANDLER_COMMUNICATE_WITH_DOG = "Советы кинолога по первичному общению с собакой ";
    public final static String RECOMMENDATIONS_FURTHER_REFERENCE_THEM = "Рекомендации по проверенным кинологам для дальнейшего обращения к ним ";
    public final static String LIST_OF_REASONS_WHY_THEY_MAY_REFUSE_DOG = "Список причин, почему могут отказать и не дать забрать собаку из приюта ";
    public final static String SAFETY_NOTES_BUTTON_DOG = "Техника безопасности в приюте собак";
    public final static String CONTACT_WITH_ME_BUTTON = "Оставить контактные данные" + " " + PHONE_EMOJI; // Бот может принять и записать контактные данные для связи.


}
