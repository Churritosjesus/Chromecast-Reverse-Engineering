.class final Latk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Latr;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Laea;

.field final synthetic c:Latf;

.field private synthetic d:Z


# direct methods
.method constructor <init>(Latf;Ljava/lang/String;Laea;Z)V
    .locals 0

    .prologue
    .line 284
    iput-object p1, p0, Latk;->c:Latf;

    iput-object p2, p0, Latk;->a:Ljava/lang/String;

    iput-object p3, p0, Latk;->b:Laea;

    iput-boolean p4, p0, Latk;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldax;)V
    .locals 5

    .prologue
    .line 287
    iget-object v0, p0, Latk;->c:Latf;

    .line 1066
    iget-object v0, v0, Latf;->e:Lbkm;

    .line 287
    iget-object v1, p0, Latk;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lbkm;->a(Ljava/lang/String;)Ldbi;

    move-result-object v0

    .line 288
    if-eqz v0, :cond_0

    .line 289
    iget-object v1, p0, Latk;->b:Laea;

    invoke-interface {v1, v0}, Laea;->a(Ljava/lang/Object;)V

    .line 304
    :goto_0
    return-void

    .line 291
    :cond_0
    new-instance v0, Ldbh;

    invoke-direct {v0}, Ldbh;-><init>()V

    .line 292
    iput-object p1, v0, Ldbh;->a:Ldax;

    .line 293
    iget-object v1, p0, Latk;->a:Ljava/lang/String;

    iput-object v1, v0, Ldbh;->b:Ljava/lang/String;

    .line 294
    iget-object v1, p0, Latk;->c:Latf;

    new-instance v2, Laxc;

    iget-boolean v3, p0, Latk;->d:Z

    new-instance v4, Latl;

    invoke-direct {v4, p0}, Latl;-><init>(Latk;)V

    invoke-direct {v2, v0, v3, v4}, Laxc;-><init>(Ldbh;ZLaea;)V

    invoke-virtual {v1, v2}, Latf;->a(Lads;)V

    goto :goto_0
.end method
