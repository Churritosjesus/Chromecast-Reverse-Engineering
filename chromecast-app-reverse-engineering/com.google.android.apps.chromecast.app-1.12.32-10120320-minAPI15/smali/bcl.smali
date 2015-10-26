.class public final Lbcl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lwg;


# instance fields
.field private synthetic a:Lbcd;

.field private synthetic b:Lbcm;

.field private synthetic c:I

.field private synthetic d:Lbch;


# direct methods
.method public constructor <init>(Lbch;Lbcd;Lbcm;I)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lbcl;->d:Lbch;

    iput-object p2, p0, Lbcl;->a:Lbcd;

    iput-object p3, p0, Lbcl;->b:Lbcm;

    iput p4, p0, Lbcl;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MenuItem;)Z
    .locals 4

    .prologue
    .line 101
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lf;->dl:I

    if-ne v0, v1, :cond_1

    .line 102
    const/16 v0, 0x90

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    iget-object v1, p0, Lbcl;->a:Lbcd;

    .line 1108
    iget-object v1, v1, Lbcd;->a:Ldbk;

    .line 103
    iget-object v1, v1, Ldbk;->a:Ljava/lang/String;

    .line 2084
    iput-object v1, v0, Lapg;->b:Ljava/lang/String;

    .line 104
    invoke-virtual {v0}, Lapg;->b()V

    .line 105
    iget-object v0, p0, Lbcl;->b:Lbcm;

    iget-object v1, p0, Lbcl;->a:Lbcd;

    invoke-interface {v0, v1}, Lbcm;->a(Lbcd;)V

    .line 119
    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 106
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lf;->eh:I

    if-ne v0, v1, :cond_2

    .line 107
    const/16 v0, 0x92

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    iget-object v1, p0, Lbcl;->a:Lbcd;

    .line 2108
    iget-object v1, v1, Lbcd;->a:Ldbk;

    .line 108
    iget-object v1, v1, Ldbk;->a:Ljava/lang/String;

    .line 3084
    iput-object v1, v0, Lapg;->b:Ljava/lang/String;

    .line 109
    invoke-virtual {v0}, Lapg;->b()V

    .line 110
    iget-object v0, p0, Lbcl;->d:Lbch;

    iget-object v0, v0, Lbch;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 111
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    .line 112
    invoke-static {v0}, Lblf;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 111
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 113
    :cond_2
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lf;->bt:I

    if-ne v0, v1, :cond_0

    .line 114
    const/16 v0, 0x91

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    iget-object v1, p0, Lbcl;->a:Lbcd;

    .line 3108
    iget-object v1, v1, Lbcd;->a:Ldbk;

    .line 115
    iget-object v1, v1, Ldbk;->a:Ljava/lang/String;

    .line 4084
    iput-object v1, v0, Lapg;->b:Ljava/lang/String;

    .line 116
    invoke-virtual {v0}, Lapg;->b()V

    .line 117
    iget-object v0, p0, Lbcl;->b:Lbcm;

    iget-object v1, p0, Lbcl;->a:Lbcd;

    iget v2, p0, Lbcl;->c:I

    invoke-interface {v0, v1, v2}, Lbcm;->a(Lbcd;I)V

    goto :goto_0
.end method
