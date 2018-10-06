package by.bsuir.spolks.common.command.handler;

import by.bsuir.spolks.common.command.params.CommandParams;
import by.bsuir.spolks.common.command.response.CommandResponse;

import java.util.function.Function;

/**
 * @author v.tarasevich
 * @version 1.0
 * @since 25.09.2018 23:33
 */
public interface CommandHandler<P extends CommandParams, R extends CommandResponse> extends Function<P, R> {

}