.class public Landroid/support/v7/widget/ShareActionProvider;
.super Lfb;
.source "PG"


# instance fields
.field private c:I

.field private final d:Laak;

.field private final e:Landroid/content/Context;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 157
    invoke-direct {p0, p1}, Lfb;-><init>(Landroid/content/Context;)V

    .line 124
    const/4 v0, 0x4

    iput v0, p0, Landroid/support/v7/widget/ShareActionProvider;->c:I

    .line 129
    new-instance v0, Laak;

    .line 1318
    invoke-direct {v0, p0}, Laak;-><init>(Landroid/support/v7/widget/ShareActionProvider;)V

    .line 129
    iput-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->d:Laak;

    .line 145
    const-string v0, "share_history.xml"

    iput-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->f:Ljava/lang/String;

    .line 158
    iput-object p1, p0, Landroid/support/v7/widget/ShareActionProvider;->e:Landroid/content/Context;

    .line 159
    return-void
.end method

.method public static synthetic a(Landroid/support/v7/widget/ShareActionProvider;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->e:Landroid/content/Context;

    return-object v0
.end method

.method public static synthetic a(Landroid/support/v7/widget/ShareActionProvider;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 87
    .line 4367
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 4369
    const/high16 v0, 0x8080000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :goto_0
    return-void

    .line 4373
    :cond_0
    const/high16 v0, 0x80000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0
.end method

.method public static synthetic b(Landroid/support/v7/widget/ShareActionProvider;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->f:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 5

    .prologue
    .line 182
    new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserView;

    iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserView;-><init>(Landroid/content/Context;)V

    .line 183
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_2

    .line 184
    iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->e:Landroid/content/Context;

    iget-object v2, p0, Landroid/support/v7/widget/ShareActionProvider;->f:Ljava/lang/String;

    invoke-static {v1, v2}, Lrl;->a(Landroid/content/Context;Ljava/lang/String;)Lrl;

    move-result-object v1

    .line 2283
    iget-object v2, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->a:Lrv;

    .line 2662
    iget-object v3, v2, Lrv;->c:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;)Lrv;

    move-result-object v3

    .line 2808
    iget-object v3, v3, Lrv;->a:Lrl;

    .line 2663
    if-eqz v3, :cond_0

    iget-object v4, v2, Lrv;->c:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-virtual {v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShown()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 2664
    iget-object v4, v2, Lrv;->c:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->i(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/database/DataSetObserver;

    move-result-object v4

    invoke-virtual {v3, v4}, Lrl;->unregisterObserver(Ljava/lang/Object;)V

    .line 2666
    :cond_0
    iput-object v1, v2, Lrv;->a:Lrl;

    .line 2667
    if-eqz v1, :cond_1

    iget-object v3, v2, Lrv;->c:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShown()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 2668
    iget-object v3, v2, Lrv;->c:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->i(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/database/DataSetObserver;

    move-result-object v3

    invoke-virtual {v1, v3}, Lrl;->registerObserver(Ljava/lang/Object;)V

    .line 2670
    :cond_1
    invoke-virtual {v2}, Lrv;->notifyDataSetChanged()V

    .line 2284
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2285
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->b()Z

    .line 2286
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->a()Z

    .line 189
    :cond_2
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 190
    iget-object v2, p0, Landroid/support/v7/widget/ShareActionProvider;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget v3, La;->p:I

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 191
    iget-object v2, p0, Landroid/support/v7/widget/ShareActionProvider;->e:Landroid/content/Context;

    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-static {v2, v1}, Ltf;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 3302
    iget-object v2, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->b:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3325
    iput-object p0, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->c:Lfb;

    .line 196
    sget v1, La;->bX:I

    .line 3496
    iput v1, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->d:I

    .line 198
    sget v1, La;->bW:I

    .line 4316
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 4317
    iget-object v2, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->b:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 201
    return-object v0
.end method

.method public final a(Landroid/view/SubMenu;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 218
    invoke-interface {p1}, Landroid/view/SubMenu;->clear()V

    .line 220
    iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->e:Landroid/content/Context;

    iget-object v2, p0, Landroid/support/v7/widget/ShareActionProvider;->f:Ljava/lang/String;

    invoke-static {v0, v2}, Lrl;->a(Landroid/content/Context;Ljava/lang/String;)Lrl;

    move-result-object v2

    .line 221
    iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 223
    invoke-virtual {v2}, Lrl;->a()I

    move-result v4

    .line 224
    iget v0, p0, Landroid/support/v7/widget/ShareActionProvider;->c:I

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    move v0, v1

    .line 227
    :goto_0
    if-ge v0, v5, :cond_0

    .line 228
    invoke-virtual {v2, v0}, Lrl;->a(I)Landroid/content/pm/ResolveInfo;

    move-result-object v6

    .line 229
    invoke-virtual {v6, v3}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {p1, v1, v0, v0, v7}, Landroid/view/SubMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v7

    invoke-virtual {v6, v3}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-interface {v7, v6}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object v6

    iget-object v7, p0, Landroid/support/v7/widget/ShareActionProvider;->d:Laak;

    invoke-interface {v6, v7}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 227
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 234
    :cond_0
    if-ge v5, v4, :cond_1

    .line 236
    iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->e:Landroid/content/Context;

    sget v6, La;->bU:I

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v5, v5, v0}, Landroid/view/SubMenu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v5

    move v0, v1

    .line 239
    :goto_1
    if-ge v0, v4, :cond_1

    .line 240
    invoke-virtual {v2, v0}, Lrl;->a(I)Landroid/content/pm/ResolveInfo;

    move-result-object v6

    .line 241
    invoke-virtual {v6, v3}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v5, v1, v0, v0, v7}, Landroid/view/SubMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v7

    invoke-virtual {v6, v3}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-interface {v7, v6}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object v6

    iget-object v7, p0, Landroid/support/v7/widget/ShareActionProvider;->d:Laak;

    invoke-interface {v6, v7}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 239
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 246
    :cond_1
    return-void
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 209
    const/4 v0, 0x1

    return v0
.end method
