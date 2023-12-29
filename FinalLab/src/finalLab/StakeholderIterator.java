
package finalLab;

import java.util.List;

/**
 *
 * @author Irfan khan
 */
class StakeholderIterator implements IIterator<Stakeholder> {
    private List<Stakeholder> stakeholders;
    private int index;

    public StakeholderIterator(List<Stakeholder> stakeholders) {
        this.stakeholders = stakeholders;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < stakeholders.size();
    }

    @Override
    public Stakeholder next() {
        return stakeholders.get(index++);
    }
}
