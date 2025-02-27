/*
 * Copyright (c) 2021-2022 LambdAurora <email@lambdaurora.dev>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package dev.lambdaurora.aurorasdeco.entity.goal;

import net.minecraft.entity.passive.TameableEntity;

public class TameableSleepInPetBedGoal extends SleepInPetBedGoal {
	private final TameableEntity tameable;

	public TameableSleepInPetBedGoal(TameableEntity tameable, double speed) {
		super(tameable, speed);

		this.tameable = tameable;
	}

	@Override
	public void setInSleepingPosition(boolean value) {
		this.tameable.setInSittingPose(value || this.tameable.isSitting());
	}
}
