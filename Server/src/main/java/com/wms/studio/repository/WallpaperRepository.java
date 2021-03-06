/*
 * Licensed under the Apache License, Version 2.0 (the "License");
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

package com.wms.studio.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wms.studio.entity.User;
import com.wms.studio.entity.Wallpaper;

/**
 * @author WMS
 * 
 */
public interface WallpaperRepository extends JpaRepository<Wallpaper, Integer>,
		JpaSpecificationExecutor<Wallpaper> {

	List<Wallpaper> findByUser(User user);

	Page<Wallpaper> findByUser(User user, Pageable pageable);

	List<Wallpaper> findByIsDefaultTrue();

	Long countByAddDateAfterAndUser(Date start, User user);
}
