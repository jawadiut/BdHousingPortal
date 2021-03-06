package net.therap.dao;

import net.therap.domain.FlatOwner;
import net.therap.domain.User;

/**
 * Created by IntelliJ IDEA.
 * User: ashraf
 * Date: 6/3/12
 * Time: 12:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface FlatOwnerDao {

    public void saveFlatUser(FlatOwner flatOwner);

    public FlatOwner getFlatOwnerByUser(User user);

    public FlatOwner getFlatOwnerById(long id);

    public void updateFlatOwner(FlatOwner flatOwner);
}
