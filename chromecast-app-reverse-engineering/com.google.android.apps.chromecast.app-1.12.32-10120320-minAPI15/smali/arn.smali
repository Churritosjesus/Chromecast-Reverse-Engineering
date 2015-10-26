.class final Larn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Lark;


# direct methods
.method constructor <init>(Lark;)V
    .locals 0

    .prologue
    .line 251
    iput-object p1, p0, Larn;->a:Lark;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 251
    check-cast p1, Ldcd;

    .line 1254
    iget-object v0, p0, Larn;->a:Lark;

    invoke-static {v0}, Lark;->b(Lark;)Lblp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 1255
    iget-object v0, p0, Larn;->a:Lark;

    invoke-static {v0, p1}, Lark;->a(Lark;Ldcd;)Ldcd;

    .line 1256
    iget-object v0, p0, Larn;->a:Lark;

    invoke-static {v0}, Lark;->c(Lark;)Ldcd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1257
    iget-object v0, p0, Larn;->a:Lark;

    iget-object v1, p0, Larn;->a:Lark;

    invoke-static {v1}, Lark;->c(Lark;)Ldcd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lark;->a(Ldcd;)V

    .line 251
    :cond_0
    return-void
.end method
