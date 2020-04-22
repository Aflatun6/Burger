package collections.sets.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public abstract class HeavenlyBody {

    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Key key;

    public enum BodyTypes {
//        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
//        COMET,
//        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();

    }

    public Key getKey() {
        return key;
    }

//    public double getOrbitalPeriod() {
//        return orbitalPeriod;
//    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }


    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return name.hashCode() + 57 + bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if( obj instanceof Key) {
                Key k = (Key) obj;
                if (name.equals(k.getName())) {
                    return bodyType.equals(k.getBodyType());
                }
            }
            return false;
        }

        @Override
        public String toString() {
            return name + ": " + bodyType;
        }
    }
}
