.class final Ltj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lps;

.field private synthetic b:Lti;


# direct methods
.method constructor <init>(Lti;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 184
    iput-object p1, p0, Ltj;->b:Lti;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 185
    new-instance v0, Lps;

    iget-object v1, p0, Ltj;->b:Lti;

    .line 1054
    iget-object v1, v1, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 185
    invoke-virtual {v1}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v1

    const v3, 0x102002c

    iget-object v4, p0, Ltj;->b:Lti;

    .line 2054
    iget-object v6, v4, Lti;->b:Ljava/lang/CharSequence;

    move v4, v2

    move v5, v2

    .line 185
    invoke-direct/range {v0 .. v6}, Lps;-><init>(Landroid/content/Context;IIIILjava/lang/CharSequence;)V

    iput-object v0, p0, Ltj;->a:Lps;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 189
    iget-object v0, p0, Ltj;->b:Lti;

    .line 3054
    iget-object v0, v0, Lti;->c:Landroid/view/Window$Callback;

    .line 189
    if-eqz v0, :cond_0

    iget-object v0, p0, Ltj;->b:Lti;

    .line 4054
    iget-boolean v0, v0, Lti;->d:Z

    .line 189
    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Ltj;->b:Lti;

    .line 5054
    iget-object v0, v0, Lti;->c:Landroid/view/Window$Callback;

    .line 190
    const/4 v1, 0x0

    iget-object v2, p0, Ltj;->a:Lps;

    invoke-interface {v0, v1, v2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 192
    :cond_0
    return-void
.end method
