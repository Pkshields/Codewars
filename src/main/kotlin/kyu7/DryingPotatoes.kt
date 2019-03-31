package kyu7

fun potatoes(initialPercentWater: Int, initialWeight: Int, finalPercentWater: Int) =
    initialWeight * (100 - initialPercentWater) / (100 - finalPercentWater)

/**
 * URL: https://www.codewars.com/kata/drying-potatoes/kotlin
 *
 * Working out...
 *
 * 100kg potatoes
 * 99% is water
 * 99kg is water
 *
 * 50kg potatoes
 * 98% is water
 * 49kg is water
 *
 * 1kg is still mass
 *
 * initial weight = initial water weight + initial dry weight
 * final weight = final water weight + initial dry weight
 *
 * 100 = 0.99*100 + 0.01*100
 * 50 = 0.98*50 + 0.01*100
 *
 * ik = iwk + idk
 * fk = fwk + idk
 * iwk = ik * iwp
 * fwk = fk * fwp
 *
 * ik = (ik * iwp) + idk
 * fk = (fk * fwp) + idk
 * fk - (fk * fwp) = idk
 * fk(1 - fwp) = idk
 * fk = idk/(1-fwp)
 *
 * idk = (1 - iwp) * ik
 * fk = (ik(1 - iwp)) / (1 - fwp)
 */