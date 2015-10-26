.class public final Lbaw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldar;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:I


# direct methods
.method public constructor <init>(Lbau;Ldar;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 174
    iput-object p2, p0, Lbaw;->a:Ldar;

    iput-object p3, p0, Lbaw;->b:Ljava/lang/String;

    iput p4, p0, Lbaw;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 177
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 178
    if-eqz v0, :cond_0

    instance-of v1, v0, Laxb;

    if-eqz v1, :cond_0

    .line 179
    check-cast v0, Laxb;

    iget-object v1, p0, Lbaw;->a:Ldar;

    iget-object v1, v1, Ldar;->c:Ljava/lang/String;

    iget-object v2, p0, Lbaw;->b:Ljava/lang/String;

    iget-object v3, p0, Lbaw;->a:Ldar;

    iget-object v3, v3, Ldar;->d:Ldbb;

    .line 180
    invoke-interface {v0, v1, v2, v3}, Laxb;->a(Ljava/lang/String;Ljava/lang/String;Ldbb;)V

    .line 181
    const/16 v0, 0x7e

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    iget-object v1, p0, Lbaw;->a:Ldar;

    iget-object v1, v1, Ldar;->c:Ljava/lang/String;

    .line 1079
    iput-object v1, v0, Lapg;->c:Ljava/lang/String;

    .line 182
    iget v1, p0, Lbaw;->c:I

    .line 183
    invoke-virtual {v0, v1}, Lapg;->b(I)Lapg;

    move-result-object v0

    .line 184
    invoke-virtual {v0}, Lapg;->b()V

    .line 186
    :cond_0
    return-void
.end method
