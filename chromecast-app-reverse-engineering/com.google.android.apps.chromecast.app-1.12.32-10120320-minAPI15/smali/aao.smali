.class public final Laao;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lwg;


# instance fields
.field private synthetic a:Landroid/support/v7/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/Toolbar;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Laao;->a:Landroid/support/v7/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Laao;->a:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/support/v7/widget/Toolbar;)Lwg;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Laao;->a:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/support/v7/widget/Toolbar;)Lwg;

    move-result-object v0

    invoke-interface {v0, p1}, Lwg;->a(Landroid/view/MenuItem;)Z

    move-result v0

    .line 166
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
