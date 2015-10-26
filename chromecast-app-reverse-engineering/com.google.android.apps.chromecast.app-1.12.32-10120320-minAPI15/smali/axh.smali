.class final Laxh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Latr;


# instance fields
.field final synthetic a:Laxd;

.field private synthetic b:Ladz;


# direct methods
.method constructor <init>(Laxd;Ladz;)V
    .locals 0

    .prologue
    .line 196
    iput-object p1, p0, Laxh;->a:Laxd;

    iput-object p2, p0, Laxh;->b:Ladz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldax;)V
    .locals 5

    .prologue
    .line 199
    new-instance v0, Ldas;

    invoke-direct {v0}, Ldas;-><init>()V

    .line 200
    iput-object p1, v0, Ldas;->a:Ldax;

    .line 201
    iget-object v1, p0, Laxh;->a:Laxd;

    .line 1029
    iget-boolean v1, v1, Laxd;->i:Z

    .line 201
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Ldas;->b:Ljava/lang/Boolean;

    .line 203
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 204
    iget-object v1, p0, Laxh;->a:Laxd;

    .line 2029
    iget-object v1, v1, Laxd;->b:Latf;

    .line 204
    new-instance v2, Lawm;

    new-instance v3, Laxi;

    invoke-direct {v3, p0}, Laxi;-><init>(Laxh;)V

    iget-object v4, p0, Laxh;->b:Ladz;

    invoke-direct {v2, v0, v3, v4}, Lawm;-><init>(Ldas;Laea;Ladz;)V

    invoke-virtual {v1, v2}, Latf;->a(Lads;)V

    .line 219
    return-void
.end method
