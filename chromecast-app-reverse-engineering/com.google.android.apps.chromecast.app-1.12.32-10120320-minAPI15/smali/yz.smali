.class public abstract Lyz;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Lza;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5062
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5063
    new-instance v0, Lza;

    invoke-direct {v0}, Lza;-><init>()V

    iput-object v0, p0, Lyz;->a:Lza;

    .line 5064
    const/4 v0, 0x0

    iput-boolean v0, p0, Lyz;->b:Z

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public a(I)I
    .locals 1

    .prologue
    .line 5155
    const/4 v0, 0x0

    return v0
.end method

.method public abstract a(Landroid/view/ViewGroup;I)Lzr;
.end method

.method public abstract a(Lzr;I)V
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 5395
    iget-object v0, p0, Lyz;->a:Lza;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lza;->a(II)V

    .line 5396
    return-void
.end method

.method public final b(Lzr;I)V
    .locals 2

    .prologue
    .line 5130
    iput p2, p1, Lzr;->b:I

    .line 5134
    const/4 v0, 0x1

    const/16 v1, 0x207

    invoke-virtual {p1, v0, v1}, Lzr;->a(II)V

    .line 5137
    const-string v0, "RV OnBindView"

    invoke-static {v0}, La;->a(Ljava/lang/String;)V

    .line 5138
    invoke-virtual {p0, p1, p2}, Lyz;->a(Lzr;I)V

    .line 5139
    invoke-static {}, La;->b()V

    .line 5140
    return-void
.end method

.method public final c(I)V
    .locals 2

    .prologue
    .line 5429
    iget-object v0, p0, Lyz;->a:Lza;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lza;->b(II)V

    .line 5430
    return-void
.end method

.method public final d(I)V
    .locals 2

    .prologue
    .line 5480
    iget-object v0, p0, Lyz;->a:Lza;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lza;->c(II)V

    .line 5481
    return-void
.end method
