.class final Laxk;
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
    .line 235
    iput-object p1, p0, Laxk;->a:Laxd;

    iput-object p2, p0, Laxk;->b:Ladz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldax;)V
    .locals 5

    .prologue
    .line 238
    new-instance v0, Ldas;

    invoke-direct {v0}, Ldas;-><init>()V

    .line 239
    iput-object p1, v0, Ldas;->a:Ldax;

    .line 240
    iget-object v1, p0, Laxk;->a:Laxd;

    .line 1029
    iget-boolean v1, v1, Laxd;->i:Z

    .line 240
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Ldas;->b:Ljava/lang/Boolean;

    .line 241
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 242
    iget-object v1, p0, Laxk;->a:Laxd;

    .line 2029
    iget-object v1, v1, Laxd;->b:Latf;

    .line 242
    new-instance v2, Lbbc;

    new-instance v3, Laxl;

    invoke-direct {v3, p0}, Laxl;-><init>(Laxk;)V

    iget-object v4, p0, Laxk;->b:Ladz;

    invoke-direct {v2, v0, v3, v4}, Lbbc;-><init>(Ldas;Laea;Ladz;)V

    invoke-virtual {v1, v2}, Latf;->a(Lads;)V

    .line 255
    return-void
.end method
