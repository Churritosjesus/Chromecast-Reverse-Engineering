.class public final Lari;
.super Lyz;
.source "PG"


# instance fields
.field b:[Ldce;

.field c:I

.field private final d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lyz;-><init>()V

    .line 42
    iput-object p1, p0, Lari;->d:Landroid/content/Context;

    .line 43
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lari;->b:[Ldce;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lari;->b:[Ldce;

    array-length v0, v0

    goto :goto_0
.end method

.method public final synthetic a(Landroid/view/ViewGroup;I)Lzr;
    .locals 4

    .prologue
    .line 20
    .line 1065
    new-instance v0, Larj;

    iget-object v1, p0, Lari;->d:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->gA:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Larj;-><init>(Lari;Landroid/view/View;)V

    .line 20
    return-object v0
.end method

.method public final synthetic a(Lzr;I)V
    .locals 4

    .prologue
    .line 20
    check-cast p1, Larj;

    .line 1058
    iget-object v0, p0, Lari;->b:[Ldce;

    aget-object v0, v0, p2

    iget-object v0, v0, Ldce;->a:Ljava/lang/String;

    .line 1059
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v1

    const/4 v2, 0x0

    iget v3, p0, Lari;->c:I

    .line 1060
    invoke-static {v2, v3, v0}, Lbks;->a(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p1, Larj;->k:Landroid/widget/ImageView;

    const/4 v3, 0x1

    .line 1059
    invoke-virtual {v1, v0, v2, v3}, Latf;->a(Ljava/lang/String;Landroid/widget/ImageView;Z)Laex;

    .line 20
    return-void
.end method
