.class final Lcqt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lcqv;


# direct methods
.method constructor <init>(Lcqs;)V
    .locals 0

    .prologue
    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Lcqu;
    .locals 2

    .prologue
    .line 175
    new-instance v1, Lcqu;

    invoke-direct {v1}, Lcqu;-><init>()V

    .line 176
    sget v0, La;->hY:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcqu;->b:Landroid/widget/ImageView;

    .line 177
    sget v0, La;->hR:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcqu;->a:Landroid/widget/TextView;

    .line 178
    return-object v1
.end method
