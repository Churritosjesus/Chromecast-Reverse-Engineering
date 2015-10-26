.class final Lazi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lapd;

.field private synthetic b:Lbdn;

.field private synthetic c:Lbdj;

.field private synthetic d:Lazg;


# direct methods
.method constructor <init>(Lazg;Lapd;Lbdn;Lbdj;)V
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Lazi;->d:Lazg;

    iput-object p2, p0, Lazi;->a:Lapd;

    iput-object p3, p0, Lazi;->b:Lbdn;

    iput-object p4, p0, Lazi;->c:Lbdj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 204
    .line 1208
    iget-object v0, p0, Lazi;->d:Lazg;

    iget-object v1, p0, Lazi;->a:Lapd;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lazg;->a(Lazg;Lapd;I)V

    .line 1209
    iget-object v0, p0, Lazi;->b:Lbdn;

    iget-object v1, p0, Lazi;->c:Lbdj;

    invoke-interface {v0, v1}, Lbdn;->a(Ljava/lang/Object;)V

    .line 204
    return-void
.end method

.method public final b_(I)V
    .locals 3

    .prologue
    .line 214
    const/16 v0, -0x63

    if-eq p1, v0, :cond_0

    .line 215
    iget-object v0, p0, Lazi;->d:Lazg;

    iget-object v1, p0, Lazi;->a:Lapd;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lazg;->a(Lazg;Lapd;I)V

    .line 217
    :cond_0
    iget-object v0, p0, Lazi;->b:Lbdn;

    invoke-interface {v0, p1}, Lbdn;->b_(I)V

    .line 218
    return-void
.end method
