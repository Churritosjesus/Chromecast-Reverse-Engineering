.class final Ltl;
.super Liv;
.source "PG"


# instance fields
.field private synthetic a:Lti;


# direct methods
.method constructor <init>(Lti;)V
    .locals 0

    .prologue
    .line 620
    iput-object p1, p0, Ltl;->a:Lti;

    invoke-direct {p0}, Liv;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 623
    iget-object v0, p0, Ltl;->a:Lti;

    .line 1054
    iget-object v0, v0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 623
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 624
    return-void
.end method
