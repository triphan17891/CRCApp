/*
 *  Created by Tri Phan on 7/01/19 8:36 PM
 *  Copyright (c) 2019 . All rights reserved.
 *  Last modified 7/01/19 8:36 PM
 */

package edu.flinders.crcapp.injection;

import edu.flinders.crcapp.view.impl.ContactActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ContactViewModule.class)
public interface ContactViewComponent {
    void inject(ContactActivity activity);
}