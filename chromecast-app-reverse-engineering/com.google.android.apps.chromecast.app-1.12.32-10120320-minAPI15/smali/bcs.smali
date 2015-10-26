.class final Lbcs;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Latr;


# instance fields
.field private synthetic a:Ldbl;

.field private synthetic b:Ladz;

.field private synthetic c:Lbcn;


# direct methods
.method constructor <init>(Lbcn;Ldbl;Ladz;)V
    .locals 0

    .prologue
    .line 267
    iput-object p1, p0, Lbcs;->c:Lbcn;

    iput-object p2, p0, Lbcs;->a:Ldbl;

    iput-object p3, p0, Lbcs;->b:Ladz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldax;)V
    .locals 5

    .prologue
    .line 270
    iget-object v0, p0, Lbcs;->a:Ldbl;

    iput-object p1, v0, Ldbl;->a:Ldax;

    .line 271
    iget-object v0, p0, Lbcs;->c:Lbcn;

    invoke-static {v0}, Lbcn;->a(Lbcn;)Lblp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lbcs;->a:Ldbl;

    aput-object v2, v0, v1

    .line 272
    iget-object v0, p0, Lbcs;->c:Lbcn;

    invoke-static {v0}, Lbcn;->g(Lbcn;)Latf;

    move-result-object v0

    new-instance v1, Lbcc;

    iget-object v2, p0, Lbcs;->a:Ldbl;

    iget-object v3, p0, Lbcs;->c:Lbcn;

    invoke-static {v3}, Lbcn;->f(Lbcn;)Laea;

    move-result-object v3

    iget-object v4, p0, Lbcs;->b:Ladz;

    invoke-direct {v1, v2, v3, v4}, Lbcc;-><init>(Ldbl;Laea;Ladz;)V

    invoke-virtual {v0, v1}, Latf;->a(Lads;)V

    .line 274
    return-void
.end method
