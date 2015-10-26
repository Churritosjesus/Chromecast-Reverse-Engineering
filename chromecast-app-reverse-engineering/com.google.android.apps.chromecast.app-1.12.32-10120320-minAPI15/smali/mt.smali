.class final Lmt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lmo;


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lmw;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 516
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 517
    iput-object p1, p0, Lmt;->a:Landroid/app/Activity;

    .line 518
    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 522
    iget-object v0, p0, Lmt;->a:Landroid/app/Activity;

    invoke-static {v0}, Lmv;->a(Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 554
    iget-object v0, p0, Lmt;->b:Lmw;

    iget-object v1, p0, Lmt;->a:Landroid/app/Activity;

    invoke-static {v0, v1, p1}, Lmv;->a(Lmw;Landroid/app/Activity;I)Lmw;

    move-result-object v0

    iput-object v0, p0, Lmt;->b:Lmw;

    .line 556
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;I)V
    .locals 2

    .prologue
    .line 546
    iget-object v0, p0, Lmt;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayShowHomeEnabled(Z)V

    .line 547
    iget-object v0, p0, Lmt;->a:Landroid/app/Activity;

    invoke-static {v0, p1, p2}, Lmv;->a(Landroid/app/Activity;Landroid/graphics/drawable/Drawable;I)Lmw;

    move-result-object v0

    iput-object v0, p0, Lmt;->b:Lmw;

    .line 549
    iget-object v0, p0, Lmt;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayShowHomeEnabled(Z)V

    .line 550
    return-void
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    .prologue
    .line 527
    iget-object v0, p0, Lmt;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    .line 529
    if-eqz v0, :cond_0

    .line 530
    invoke-virtual {v0}, Landroid/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    .line 534
    :goto_0
    return-object v0

    .line 532
    :cond_0
    iget-object v0, p0, Lmt;->a:Landroid/app/Activity;

    goto :goto_0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 539
    iget-object v0, p0, Lmt;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    .line 540
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/ActionBar;->getDisplayOptions()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
