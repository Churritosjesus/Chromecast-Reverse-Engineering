.class final Laye;
.super Lzj;
.source "PG"


# instance fields
.field private synthetic a:I

.field private synthetic b:Ldbf;


# direct methods
.method constructor <init>(Laxy;ILdbf;)V
    .locals 0

    .prologue
    .line 191
    iput p2, p0, Laye;->a:I

    iput-object p3, p0, Laye;->b:Ldbf;

    invoke-direct {p0}, Lzj;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 194
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 195
    const/16 v0, 0x75

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    iget v1, p0, Laye;->a:I

    .line 196
    invoke-virtual {v0, v1}, Lapg;->b(I)Lapg;

    move-result-object v0

    iget-object v1, p0, Laye;->b:Ldbf;

    iget-object v1, v1, Ldbf;->e:Ljava/lang/String;

    .line 1084
    iput-object v1, v0, Lapg;->b:Ljava/lang/String;

    .line 198
    invoke-virtual {v0}, Lapg;->b()V

    .line 200
    :cond_0
    return-void
.end method
