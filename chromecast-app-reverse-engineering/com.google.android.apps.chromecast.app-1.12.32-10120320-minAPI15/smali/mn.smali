.class public Lmn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lkt;


# instance fields
.field public final a:Landroid/support/v4/widget/DrawerLayout;

.field public b:Lmr;

.field public c:Landroid/graphics/drawable/Drawable;

.field public d:Z

.field public final e:I

.field public final f:I

.field private final g:Lmo;

.field private h:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;II)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 151
    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, v2

    move v5, p3

    move v6, p4

    invoke-direct/range {v0 .. v6}, Lmn;-><init>(Landroid/app/Activity;Landroid/support/v7/widget/Toolbar;Landroid/support/v4/widget/DrawerLayout;Landroid/graphics/drawable/Drawable;II)V

    .line 153
    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;Landroid/support/v7/widget/Toolbar;Landroid/support/v4/widget/DrawerLayout;Landroid/graphics/drawable/Drawable;II)V
    .locals 2

    .prologue
    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    const/4 v0, 0x1

    iput-boolean v0, p0, Lmn;->d:Z

    .line 128
    const/4 v0, 0x0

    iput-boolean v0, p0, Lmn;->h:Z

    .line 207
    instance-of v0, p1, Lmp;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 208
    check-cast v0, Lmp;

    invoke-interface {v0}, Lmp;->c()Lmo;

    move-result-object v0

    iput-object v0, p0, Lmn;->g:Lmo;

    .line 217
    :goto_0
    iput-object p3, p0, Lmn;->a:Landroid/support/v4/widget/DrawerLayout;

    .line 218
    iput p5, p0, Lmn;->e:I

    .line 219
    iput p6, p0, Lmn;->f:I

    .line 221
    new-instance v0, Lmq;

    iget-object v1, p0, Lmn;->g:Lmo;

    invoke-interface {v1}, Lmo;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lmq;-><init>(Landroid/app/Activity;Landroid/content/Context;)V

    iput-object v0, p0, Lmn;->b:Lmr;

    .line 227
    invoke-virtual {p0}, Lmn;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lmn;->c:Landroid/graphics/drawable/Drawable;

    .line 228
    return-void

    .line 209
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    .line 210
    new-instance v0, Lmu;

    .line 1562
    invoke-direct {v0, p1}, Lmu;-><init>(Landroid/app/Activity;)V

    .line 210
    iput-object v0, p0, Lmn;->g:Lmo;

    goto :goto_0

    .line 211
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_2

    .line 212
    new-instance v0, Lmt;

    .line 2511
    invoke-direct {v0, p1}, Lmt;-><init>(Landroid/app/Activity;)V

    .line 212
    iput-object v0, p0, Lmn;->g:Lmo;

    goto :goto_0

    .line 214
    :cond_2
    new-instance v0, Lms;

    invoke-direct {v0, p1}, Lms;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lmn;->g:Lmo;

    goto :goto_0
.end method

.method private a(I)V
    .locals 1

    .prologue
    .line 461
    iget-object v0, p0, Lmn;->g:Lmo;

    invoke-interface {v0, p1}, Lmo;->a(I)V

    .line 462
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 391
    iget-object v0, p0, Lmn;->b:Lmr;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {v0, v1}, Lmr;->a(F)V

    .line 392
    iget-boolean v0, p0, Lmn;->d:Z

    if-eqz v0, :cond_0

    .line 393
    iget v0, p0, Lmn;->f:I

    invoke-direct {p0, v0}, Lmn;->a(I)V

    .line 395
    :cond_0
    return-void
.end method

.method public final a(F)V
    .locals 3

    .prologue
    .line 379
    iget-object v0, p0, Lmn;->b:Lmr;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-static {v2, p1}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-interface {v0, v1}, Lmr;->a(F)V

    .line 380
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;I)V
    .locals 2

    .prologue
    .line 451
    iget-boolean v0, p0, Lmn;->h:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lmn;->g:Lmo;

    invoke-interface {v0}, Lmo;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 452
    const-string v0, "ActionBarDrawerToggle"

    const-string v1, "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 455
    const/4 v0, 0x1

    iput-boolean v0, p0, Lmn;->h:Z

    .line 457
    :cond_0
    iget-object v0, p0, Lmn;->g:Lmo;

    invoke-interface {v0, p1, p2}, Lmo;->a(Landroid/graphics/drawable/Drawable;I)V

    .line 458
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 406
    iget-object v0, p0, Lmn;->b:Lmr;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lmr;->a(F)V

    .line 407
    iget-boolean v0, p0, Lmn;->d:Z

    if-eqz v0, :cond_0

    .line 408
    iget v0, p0, Lmn;->e:I

    invoke-direct {p0, v0}, Lmn;->a(I)V

    .line 410
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    const v2, 0x800003

    .line 240
    iget-object v0, p0, Lmn;->a:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 241
    iget-object v0, p0, Lmn;->b:Lmr;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {v0, v1}, Lmr;->a(F)V

    .line 245
    :goto_0
    iget-boolean v0, p0, Lmn;->d:Z

    if-eqz v0, :cond_0

    .line 246
    iget-object v0, p0, Lmn;->b:Lmr;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lmn;->a:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v1, v2}, Landroid/support/v4/widget/DrawerLayout;->e(I)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lmn;->f:I

    :goto_1
    invoke-virtual {p0, v0, v1}, Lmn;->a(Landroid/graphics/drawable/Drawable;I)V

    .line 250
    :cond_0
    return-void

    .line 243
    :cond_1
    iget-object v0, p0, Lmn;->b:Lmr;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lmr;->a(F)V

    goto :goto_0

    .line 246
    :cond_2
    iget v1, p0, Lmn;->e:I

    goto :goto_1
.end method

.method public d()V
    .locals 4

    .prologue
    const v3, 0x800003

    .line 286
    iget-object v0, p0, Lmn;->a:Landroid/support/v4/widget/DrawerLayout;

    .line 3426
    invoke-virtual {v0, v3}, Landroid/support/v4/widget/DrawerLayout;->b(I)Landroid/view/View;

    move-result-object v1

    .line 3427
    if-eqz v1, :cond_0

    .line 3428
    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->h(Landroid/view/View;)Z

    move-result v0

    .line 286
    :goto_0
    if-eqz v0, :cond_2

    .line 287
    iget-object v0, p0, Lmn;->a:Landroid/support/v4/widget/DrawerLayout;

    .line 4360
    invoke-virtual {v0, v3}, Landroid/support/v4/widget/DrawerLayout;->b(I)Landroid/view/View;

    move-result-object v1

    .line 4361
    if-nez v1, :cond_1

    .line 4362
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No drawer view found with gravity "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Landroid/support/v4/widget/DrawerLayout;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3430
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 4365
    :cond_1
    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)V

    .line 291
    :goto_1
    return-void

    .line 289
    :cond_2
    iget-object v0, p0, Lmn;->a:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v3}, Landroid/support/v4/widget/DrawerLayout;->d(I)V

    goto :goto_1
.end method

.method public final e()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 465
    iget-object v0, p0, Lmn;->g:Lmo;

    invoke-interface {v0}, Lmo;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method
