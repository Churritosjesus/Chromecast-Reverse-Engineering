.class public final Lavy;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:I

.field private b:Lawa;

.field private final c:Lblp;

.field private d:Lauv;


# direct methods
.method public constructor <init>(Lauv;ILawa;)V
    .locals 2

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput p2, p0, Lavy;->a:I

    .line 39
    new-instance v0, Lblp;

    const-string v1, "MtuNegotiator"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lavy;->c:Lblp;

    .line 40
    iput-object p1, p0, Lavy;->d:Lauv;

    .line 41
    iput-object p3, p0, Lavy;->b:Lawa;

    .line 42
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 48
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lavy;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 49
    new-instance v0, Lavw;

    new-instance v1, Lavz;

    invoke-direct {v1, p0}, Lavz;-><init>(Lavy;)V

    iget v2, p0, Lavy;->a:I

    invoke-direct {v0, v1, v2}, Lavw;-><init>(Lavx;I)V

    .line 73
    iget-object v1, p0, Lavy;->d:Lauv;

    invoke-virtual {v1, v0}, Lauv;->b(Lavr;)V

    .line 74
    return-void
.end method
