.class final Latl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Latk;


# direct methods
.method constructor <init>(Latk;)V
    .locals 0

    .prologue
    .line 296
    iput-object p1, p0, Latl;->a:Latk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 296
    check-cast p1, Ldbi;

    .line 1299
    iget-object v0, p0, Latl;->a:Latk;

    iget-object v0, v0, Latk;->c:Latf;

    .line 2066
    iget-object v0, v0, Latf;->e:Lbkm;

    .line 1299
    iget-object v1, p0, Latl;->a:Latk;

    iget-object v1, v1, Latk;->a:Ljava/lang/String;

    .line 3062
    iget-object v2, v0, Lbkm;->a:Landroid/util/LruCache;

    new-instance v3, Lbkn;

    invoke-direct {v3, v0, p1}, Lbkn;-><init>(Lbkm;Ljava/lang/Object;)V

    invoke-virtual {v2, v1, v3}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1300
    iget-object v0, p0, Latl;->a:Latk;

    iget-object v0, v0, Latk;->b:Laea;

    invoke-interface {v0, p1}, Laea;->a(Ljava/lang/Object;)V

    .line 296
    return-void
.end method
