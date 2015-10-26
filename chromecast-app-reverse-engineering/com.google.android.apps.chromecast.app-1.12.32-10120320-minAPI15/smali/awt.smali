.class final Lawt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lawr;


# direct methods
.method constructor <init>(Lawr;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lawt;->a:Lawr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const v1, 0x7fffffff

    .line 160
    iget-object v0, p0, Lawt;->a:Lawr;

    invoke-static {v0}, Lawr;->b(Lawr;)I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 161
    iget-object v0, p0, Lawt;->a:Lawr;

    iget-object v1, p0, Lawt;->a:Lawr;

    .line 162
    invoke-virtual {v1}, Lawr;->e()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, La;->fa:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    .line 161
    invoke-static {v0, v1}, Lawr;->b(Lawr;I)I

    .line 172
    :goto_0
    iget-object v0, p0, Lawt;->a:Lawr;

    invoke-static {v0}, Lawr;->c(Lawr;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lawt;->a:Lawr;

    invoke-static {v1}, Lawr;->b(Lawr;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 173
    return-void

    .line 164
    :cond_0
    iget-object v0, p0, Lawt;->a:Lawr;

    invoke-static {v0, v1}, Lawr;->b(Lawr;I)I

    .line 165
    iget-object v0, p0, Lawt;->a:Lawr;

    invoke-static {v0}, Lawr;->a(Lawr;)Landroid/widget/ScrollView;

    move-result-object v0

    new-instance v1, Lawu;

    invoke-direct {v1, p0}, Lawu;-><init>(Lawt;)V

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
