/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.idm.engine.impl.persistence.entity.data;

import java.util.List;
import java.util.Map;

import org.flowable.common.engine.impl.persistence.entity.data.DataManager;
import org.flowable.idm.api.Group;
import org.flowable.idm.engine.impl.GroupQueryImpl;
import org.flowable.idm.engine.impl.persistence.entity.GroupEntity;

/**
 * @author Joram Barrez
 */
public interface GroupDataManager extends DataManager<GroupEntity> {

    List<Group> findGroupByQueryCriteria(GroupQueryImpl query);

    long findGroupCountByQueryCriteria(GroupQueryImpl query);

    List<Group> findGroupsByUser(String userId);

    List<Group> findGroupsByPrivilegeId(String privilegeId);

    List<Group> findGroupsByNativeQuery(Map<String, Object> parameterMap);

    long findGroupCountByNativeQuery(Map<String, Object> parameterMap);

}
