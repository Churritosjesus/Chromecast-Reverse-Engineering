.class final Ltk;
.super Liv;
.source "PG"


# instance fields
.field private a:Z

.field private synthetic b:Lti;


# direct methods
.method constructor <init>(Lti;)V
    .locals 1

    .prologue
    .line 604
    iput-object p1, p0, Ltk;->b:Lti;

    invoke-direct {p0}, Liv;-><init>()V

    .line 605
    const/4 v0, 0x0

    iput-boolean v0, p0, Ltk;->a:Z

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 608
    iget-boolean v0, p0, Ltk;->a:Z

    if-nez v0, :cond_0

    .line 609
    iget-object v0, p0, Ltk;->b:Lti;

    .line 1054
    iget-object v0, v0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 609
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 611
    :cond_0
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 615
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltk;->a:Z

    .line 616
    return-void
.end method
