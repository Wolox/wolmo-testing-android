package ar.com.wolox.wolmo.testing.mockito

import org.mockito.Mockito
import org.mockito.Mockito.atLeastOnce
import org.mockito.Mockito.times

/**
 * Use this method to verify a certain behavior happened just a single time.
 *
 * @param mock the mocked class.
 * <pre>{@code
 * verifyOnce(mockedClass).expectedBehavior()}
 * </pre>
 */
fun <T> verifyOnce(mock: T): T =
    Mockito.verify(mock, times(1))

/**
 * Use this method to verify a certain behavior happened at least one time.
 *
 * @param mock the mocked class.
 * <pre>{@code
 * verifyAtLeastOnce(mockedClass).expectedBehavior()}
 * </pre>
 */
fun <T> verifyAtLeastOnce(mock: T): T =
    Mockito.verify(mock, atLeastOnce())

/**
 * Use this method to verify a certain behavior did not happen at all.
 *
 * @param mock the mocked class.
 * <pre>{@code
 * verifyZeroTimes(mockedClass).unexpectedBehavior()}
 * </pre>
 */
fun <T> verifyZeroTimes(mock: T): T =
    Mockito.verify(mock, times(0))

/**
 * Use this method to verify a certain behavior happened a custom number of times.
 *
 * @param mock the mocked class.
 * <pre>{@code
 * verifyCustomTimes(mockedClass, 3).expectedBehavior()}
 * </pre>
 */
fun <T> verifyCustomTimes(mock: T, times: Int) =
    Mockito.verify(mock, times(times))
