package ru.g4.energy.drivers.ce102.data;

import ru.g4.energy.drivers.ce102.exequtors.AbstractCurrentParameterExequtor;
import ru.g4.energy.drivers.ce102.exequtors.PowerLimitExequtor;

/**
 * ����� ��������� ��� �������� ��������� ����� ��������.
 */
public class CurrentPowerLimit extends AbstractCurrentParameter {

	@Override
	public AbstractCurrentParameterExequtor getExequtor() {
		
		return new PowerLimitExequtor(this);
	}

	@Override
	public String toString()
	{
		return "CurrentPowerLimit [getExequtor()=" + getExequtor().getClass()
				+ ", isWriteable()=" + isWriteable() + ", getNumber()="
				+ getNumber() + ", getInner()=" + getInner() + "]";
	}
	
	
}
