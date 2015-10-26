.class public final Lblx;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static a:Lblp;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 96
    new-instance v0, Lblp;

    const-string v1, "Util"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lblx;->a:Lblp;

    return-void
.end method

.method public static a(Landroid/app/Activity;)I
    .locals 2

    .prologue
    .line 300
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 301
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 302
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method public static varargs a(Landroid/content/Context;ILjava/lang/String;[Ljava/lang/String;)Landroid/view/View;
    .locals 2

    .prologue
    .line 248
    const-string v0, "layout_inflater"

    .line 249
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 250
    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 251
    sget v0, Lf;->bY:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 252
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    invoke-static {v0, p3}, Lblx;->a(Landroid/widget/TextView;[Ljava/lang/String;)V

    .line 254
    return-object v1
.end method

.method public static varargs a(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)Landroid/view/View;
    .locals 1

    .prologue
    .line 234
    sget v0, La;->fm:I

    invoke-static {p0, v0, p1, p2}, Lblx;->a(Landroid/content/Context;ILjava/lang/String;[Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public static a([Ljava/lang/String;)Ldax;
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 658
    new-instance v0, Ldax;

    invoke-direct {v0}, Ldax;-><init>()V

    .line 659
    invoke-static {}, Lblj;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ldax;->d:Ljava/lang/String;

    .line 660
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Ldax;->a:Ljava/lang/Integer;

    .line 661
    iput v2, v0, Ldax;->c:I

    .line 662
    iput-object p0, v0, Ldax;->b:[Ljava/lang/String;

    .line 667
    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 399
    sget v0, Lb;->cS:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Lblj;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lbdf;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 784
    sget-object v0, Lbmf;->a:[I

    invoke-virtual {p1}, Lbdf;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 789
    sget v0, Lb;->bc:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 786
    :pswitch_0
    sget v0, Lb;->bd:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 784
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 385
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 391
    :goto_0
    return-object p0

    .line 388
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 389
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toTitleCase(C)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 391
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toTitleCase(C)C

    move-result v0

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ldaz;)Ljava/util/Set;
    .locals 8

    .prologue
    .line 635
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 636
    const/16 v1, 0x80

    .line 637
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v0

    .line 639
    new-instance v1, Ljava/util/HashSet;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 640
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;

    .line 641
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 644
    :cond_0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 645
    iget-object v3, p1, Ldaz;->f:[Ldba;

    array-length v4, v3

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v4, :cond_2

    aget-object v5, v3, v0

    .line 646
    iget-object v6, v5, Ldba;->b:Ljava/lang/String;

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 647
    iget-object v5, v5, Ldba;->a:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 645
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 650
    :cond_2
    return-object v2
.end method

.method public static a(Landroid/app/Activity;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 490
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 533
    :goto_0
    return-void

    .line 493
    :cond_0
    new-instance v1, Lblz;

    invoke-direct {v1, p1}, Lblz;-><init>(Landroid/content/DialogInterface$OnClickListener;)V

    .line 500
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {p0}, Lblf;->S(Landroid/content/Context;)I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 502
    new-instance v0, Lbma;

    invoke-direct {v0, p0}, Lbma;-><init>(Landroid/app/Activity;)V

    .line 509
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v3, Lb;->ce:I

    .line 510
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 511
    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    sget v3, Lb;->bn:I

    .line 512
    invoke-virtual {v2, v3, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v2, Lb;->I:I

    .line 513
    invoke-virtual {v0, v2, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 514
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 531
    :goto_1
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 532
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 517
    :cond_1
    new-instance v0, Lbmb;

    invoke-direct {v0, p0}, Lbmb;-><init>(Landroid/app/Activity;)V

    .line 523
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v3, Lb;->dU:I

    .line 524
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    sget v3, Lb;->dV:I

    .line 525
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 526
    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    sget v3, Lb;->dT:I

    .line 527
    invoke-virtual {v2, v3, p1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    sget v3, Lb;->dS:I

    .line 528
    invoke-virtual {v2, v3, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 529
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_1
.end method

.method public static a(Landroid/app/Activity;Landroid/support/v7/widget/SearchView;Landroid/view/View;Landroid/view/View$OnFocusChangeListener;)V
    .locals 9

    .prologue
    const/high16 v8, 0x10000

    const/4 v7, 0x3

    const/4 v6, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 540
    const-string v0, "search"

    .line 541
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/SearchManager;

    .line 542
    invoke-virtual {p1, v2}, Landroid/support/v7/widget/SearchView;->a(Z)V

    .line 543
    invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/SearchManager;->getSearchableInfo(Landroid/content/ComponentName;)Landroid/app/SearchableInfo;

    move-result-object v0

    .line 2426
    iput-object v0, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    .line 2427
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_3

    .line 2428
    sget-boolean v0, Landroid/support/v7/widget/SearchView;->a:Z

    if-eqz v0, :cond_2

    .line 3072
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v3, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getSuggestThreshold()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setThreshold(I)V

    .line 3073
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v3, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getImeOptions()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 3074
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getInputType()I

    move-result v0

    .line 3077
    and-int/lit8 v3, v0, 0xf

    if-ne v3, v1, :cond_0

    .line 3080
    const v3, -0x10001

    and-int/2addr v0, v3

    .line 3081
    iget-object v3, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 3082
    or-int/2addr v0, v8

    .line 3089
    const/high16 v3, 0x80000

    or-int/2addr v0, v3

    .line 3092
    :cond_0
    iget-object v3, p1, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setInputType(I)V

    .line 3093
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->j:Lkj;

    if-eqz v0, :cond_1

    .line 3094
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->j:Lkj;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lkj;->a(Landroid/database/Cursor;)V

    .line 3098
    :cond_1
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 3099
    new-instance v0, Laal;

    invoke-virtual {p1}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    iget-object v5, p1, Landroid/support/v7/widget/SearchView;->n:Ljava/util/WeakHashMap;

    invoke-direct {v0, v3, p1, v4, v5}, Laal;-><init>(Landroid/content/Context;Landroid/support/v7/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V

    iput-object v0, p1, Landroid/support/v7/widget/SearchView;->j:Lkj;

    .line 3101
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v3, p1, Landroid/support/v7/widget/SearchView;->j:Lkj;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 3102
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->j:Lkj;

    check-cast v0, Laal;

    .line 3118
    iput v1, v0, Laal;->e:I

    .line 2431
    :cond_2
    invoke-virtual {p1}, Landroid/support/v7/widget/SearchView;->c()V

    .line 2434
    :cond_3
    sget-boolean v0, Landroid/support/v7/widget/SearchView;->a:Z

    if-eqz v0, :cond_9

    .line 3840
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_8

    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchEnabled()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 3841
    const/4 v0, 0x0

    .line 3842
    iget-object v3, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 3843
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->e:Landroid/content/Intent;

    .line 3847
    :cond_4
    :goto_0
    if-eqz v0, :cond_8

    .line 3848
    invoke-virtual {p1}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v3, v0, v8}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 3850
    if-eqz v0, :cond_7

    move v0, v1

    .line 2434
    :goto_1
    if-eqz v0, :cond_9

    move v0, v1

    :goto_2
    iput-boolean v0, p1, Landroid/support/v7/widget/SearchView;->k:Z

    .line 2436
    iget-boolean v0, p1, Landroid/support/v7/widget/SearchView;->k:Z

    if-eqz v0, :cond_5

    .line 2439
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    const-string v1, "nm"

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setPrivateImeOptions(Ljava/lang/String;)V

    .line 4689
    :cond_5
    iget-boolean v0, p1, Landroid/support/v7/widget/SearchView;->i:Z

    .line 2441
    invoke-virtual {p1, v0}, Landroid/support/v7/widget/SearchView;->b(Z)V

    .line 547
    sget v0, La;->bn:I

    .line 548
    invoke-virtual {p1, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 550
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 551
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 552
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 553
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 554
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 555
    iput v6, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 556
    iput v6, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 557
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 560
    sget v1, La;->br:I

    invoke-virtual {p1, v1}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 562
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, La;->dp:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 563
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 564
    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 565
    const/4 v0, 0x2

    const/high16 v3, 0x41600000    # 14.0f

    invoke-virtual {v1, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 566
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 569
    sget v0, La;->bp:I

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 571
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 574
    sget v0, La;->bm:I

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 576
    sget v3, La;->eD:I

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 577
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, La;->dZ:I

    .line 578
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 579
    invoke-virtual {v0, v3, v2, v3, v2}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 582
    sget v0, La;->bs:I

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 584
    sget v3, La;->eG:I

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 587
    sget v0, La;->bq:I

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 589
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 590
    iput v6, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 591
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 594
    invoke-virtual {v3, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 595
    sget v0, La;->bv:I

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 596
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 599
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 602
    new-instance v0, Lbmc;

    invoke-direct {v0, p2, p3, p0, v1}, Lbmc;-><init>(Landroid/view/View;Landroid/view/View$OnFocusChangeListener;Landroid/app/Activity;Landroid/widget/TextView;)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 617
    new-instance v0, Lbmd;

    invoke-direct {v0, v1}, Lbmd;-><init>(Landroid/widget/TextView;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 624
    invoke-virtual {v1}, Landroid/widget/TextView;->clearFocus()V

    .line 625
    return-void

    .line 3844
    :cond_6
    iget-object v3, p1, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 3845
    iget-object v0, p1, Landroid/support/v7/widget/SearchView;->f:Landroid/content/Intent;

    goto/16 :goto_0

    :cond_7
    move v0, v2

    .line 3850
    goto/16 :goto_1

    :cond_8
    move v0, v2

    .line 3853
    goto/16 :goto_1

    :cond_9
    move v0, v2

    .line 2434
    goto/16 :goto_2
.end method

.method private static a(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 370
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 371
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 2278
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2279
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 2280
    const-string v2, "com.android.vending"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 373
    invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v1

    if-nez v1, :cond_0

    .line 375
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 376
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 378
    :cond_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 379
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 712
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lblx;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/high16 v4, 0x10000000

    .line 721
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 724
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.CAST"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 725
    invoke-virtual {v1, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 726
    const-string v2, "source"

    const-string v3, "com.google.android.apps.chromecast.app"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 728
    invoke-static {p0, v1, p2}, Lblx;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 744
    :cond_0
    :goto_0
    return-void

    .line 731
    :cond_1
    const-string v2, "android.intent.action.VIEW"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-static {p0, v1, p2}, Lblx;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 736
    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 737
    if-eqz v0, :cond_2

    .line 738
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 739
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 741
    :cond_2
    sget v0, Lb;->bD:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method public static a(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 485
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 486
    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 470
    if-nez p0, :cond_0

    .line 479
    :goto_0
    return-void

    .line 473
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    move-object v0, p0

    .line 476
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 477
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public static a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Lapd;)V
    .locals 1

    .prologue
    .line 705
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0, p3}, Lblx;->a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapd;)V

    .line 706
    return-void
.end method

.method public static a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapd;)V
    .locals 1

    .prologue
    .line 681
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 682
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 696
    :goto_0
    return-void

    .line 684
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 685
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 686
    new-instance v0, Lbme;

    invoke-direct {v0, p2, p3, p4}, Lbme;-><init>(Ljava/lang/String;Ljava/lang/String;Lapd;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method

.method public static varargs a(Landroid/widget/TextView;[Ljava/lang/String;)V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v1, 0x0

    .line 265
    move v0, v1

    :goto_0
    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    if-ge v0, v2, :cond_2

    .line 266
    aget-object v3, p1, v0

    .line 267
    add-int/lit8 v2, v0, 0x1

    aget-object v4, p1, v2

    .line 1187
    invoke-virtual {p0, v9}, Landroid/widget/TextView;->setLinksClickable(Z)V

    .line 1190
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 1191
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    move-result-object v5

    move v2, v1

    .line 2165
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v2, v6, :cond_0

    .line 2166
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->getType(C)I

    move-result v6

    const/16 v7, 0x10

    if-ne v6, v7, :cond_0

    .line 2170
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 2172
    :cond_0
    if-lez v2, :cond_3

    .line 2173
    invoke-virtual {v3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 2175
    :goto_2
    const/4 v3, 0x2

    invoke-static {v2, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 1192
    invoke-virtual {v2, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 1193
    :goto_3
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1194
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    .line 1195
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I

    move-result v6

    .line 1198
    new-instance v7, Lbly;

    const/4 v8, 0x0

    invoke-direct {v7, v4, v8}, Lbly;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    .line 1214
    const/16 v8, 0x21

    invoke-virtual {v5, v7, v3, v6, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_3

    .line 265
    :cond_1
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 270
    :cond_2
    invoke-virtual {p0, v9}, Landroid/widget/TextView;->setAutoLinkMask(I)V

    .line 271
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 272
    return-void

    :cond_3
    move-object v2, v3

    goto :goto_2
.end method

.method public static a()Z
    .locals 1

    .prologue
    .line 773
    const/4 v0, 0x0

    return v0
.end method

.method public static a(I)Z
    .locals 2

    .prologue
    .line 443
    const/16 v0, 0x52

    if-ne p0, v0, :cond_0

    const-string v0, "LGE"

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 444
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(ILm;)Z
    .locals 2

    .prologue
    .line 457
    const/16 v0, 0x52

    if-ne p0, v0, :cond_0

    const-string v0, "LGE"

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 458
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 460
    invoke-virtual {p1}, Lm;->openOptionsMenu()V

    .line 461
    const/4 v0, 0x1

    .line 463
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/high16 v3, 0x10000

    const/4 v0, 0x1

    .line 752
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 753
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 754
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 755
    invoke-virtual {v1, p1, v3}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 756
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 766
    :goto_0
    return v0

    .line 761
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 762
    invoke-virtual {v1, p1, v3}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 763
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 766
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Landroid/app/Activity;)I
    .locals 2

    .prologue
    .line 309
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 310
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 311
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 407
    sget v0, Lb;->dK:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Lblj;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Lbdf;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 799
    sget-object v0, Lbmf;->a:[I

    invoke-virtual {p1}, Lbdf;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 803
    sget v0, Lb;->bh:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 801
    :pswitch_0
    sget v0, Lb;->bf:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 799
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(Landroid/app/Activity;)I
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 324
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    .line 325
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->orientation:I

    .line 326
    if-ne v2, v0, :cond_2

    .line 327
    if-eqz v1, :cond_0

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 340
    :cond_0
    :goto_0
    return v0

    .line 330
    :cond_1
    const/16 v0, 0x9

    goto :goto_0

    .line 333
    :cond_2
    const/4 v3, 0x2

    if-ne v2, v3, :cond_5

    .line 334
    if-eqz v1, :cond_3

    if-ne v1, v0, :cond_4

    .line 335
    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    .line 337
    :cond_4
    const/16 v0, 0x8

    goto :goto_0

    .line 340
    :cond_5
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static d(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 347
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    const/16 v1, 0xf

    const/4 v2, 0x2

    .line 348
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 347
    invoke-virtual {v0, v1, v2}, Lape;->a(ILjava/lang/Integer;)V

    .line 349
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 350
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 351
    invoke-static {p0}, Lblf;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 352
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 353
    return-void
.end method

.method public static e(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 360
    sget v0, Lb;->ay:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lblx;->a(Landroid/app/Activity;Ljava/lang/String;)V

    .line 361
    return-void
.end method

.method public static f(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 364
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    const/16 v1, 0xf

    const/4 v2, 0x0

    .line 365
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 364
    invoke-virtual {v0, v1, v2}, Lape;->a(ILjava/lang/Integer;)V

    .line 366
    invoke-static {p0}, Lblf;->W(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lblx;->a(Landroid/app/Activity;Ljava/lang/String;)V

    .line 367
    return-void
.end method

.method public static g(Landroid/app/Activity;)V
    .locals 4

    .prologue
    .line 416
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 417
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 418
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 419
    invoke-virtual {p0}, Landroid/app/Activity;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, La;->dj:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 420
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {v1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 422
    :cond_0
    return-void
.end method

.method public static h(Landroid/app/Activity;)V
    .locals 3

    .prologue
    const/high16 v2, 0x4000000

    .line 430
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 431
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    .line 435
    :cond_0
    return-void
.end method
