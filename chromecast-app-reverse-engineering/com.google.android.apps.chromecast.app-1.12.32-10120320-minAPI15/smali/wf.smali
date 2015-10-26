.class public final Lwf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lqb;


# instance fields
.field private synthetic a:Landroid/support/v7/widget/ActionMenuView;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/ActionMenuView;)V
    .locals 0

    .prologue
    .line 737
    iput-object p1, p0, Lwf;->a:Landroid/support/v7/widget/ActionMenuView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqa;)V
    .locals 1

    .prologue
    .line 746
    iget-object v0, p0, Lwf;->a:Landroid/support/v7/widget/ActionMenuView;

    invoke-static {v0}, Landroid/support/v7/widget/ActionMenuView;->b(Landroid/support/v7/widget/ActionMenuView;)Lqb;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 747
    iget-object v0, p0, Lwf;->a:Landroid/support/v7/widget/ActionMenuView;

    invoke-static {v0}, Landroid/support/v7/widget/ActionMenuView;->b(Landroid/support/v7/widget/ActionMenuView;)Lqb;

    move-result-object v0

    invoke-interface {v0, p1}, Lqb;->a(Lqa;)V

    .line 749
    :cond_0
    return-void
.end method

.method public final a(Lqa;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 740
    iget-object v0, p0, Lwf;->a:Landroid/support/v7/widget/ActionMenuView;

    invoke-static {v0}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/support/v7/widget/ActionMenuView;)Lwg;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwf;->a:Landroid/support/v7/widget/ActionMenuView;

    invoke-static {v0}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/support/v7/widget/ActionMenuView;)Lwg;

    move-result-object v0

    invoke-interface {v0, p2}, Lwg;->a(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
