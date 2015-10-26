.class final Laxp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldbg;

.field private synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Laxo;Ldbg;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 113
    iput-object p2, p0, Laxp;->a:Ldbg;

    iput-object p3, p0, Laxp;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 116
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 117
    if-eqz v0, :cond_1

    iget-object v1, p0, Laxp;->a:Ldbg;

    iget-object v1, v1, Ldbg;->h:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 118
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Laxp;->a:Ldbg;

    iget-object v1, v1, Ldbg;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 119
    const/16 v0, 0x78

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    iget-object v1, p0, Laxp;->a:Ldbg;

    iget-object v1, v1, Ldbg;->f:Ljava/lang/String;

    .line 1084
    iput-object v1, v0, Lapg;->b:Ljava/lang/String;

    .line 121
    invoke-virtual {v0}, Lapg;->b()V

    .line 126
    :cond_0
    :goto_0
    return-void

    .line 122
    :cond_1
    if-eqz v0, :cond_0

    instance-of v1, v0, Laxb;

    if-eqz v1, :cond_0

    .line 123
    check-cast v0, Laxb;

    iget-object v1, p0, Laxp;->a:Ldbg;

    iget-object v1, v1, Ldbg;->f:Ljava/lang/String;

    iget-object v2, p0, Laxp;->b:Ljava/lang/String;

    iget-object v3, p0, Laxp;->a:Ldbg;

    iget-object v3, v3, Ldbg;->g:Ldbb;

    invoke-interface {v0, v1, v2, v3}, Laxb;->a(Ljava/lang/String;Ljava/lang/String;Ldbb;)V

    goto :goto_0
.end method
