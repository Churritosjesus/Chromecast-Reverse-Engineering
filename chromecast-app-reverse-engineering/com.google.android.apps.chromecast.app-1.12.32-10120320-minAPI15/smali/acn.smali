.class final Lacn;
.super Landroid/os/AsyncTask;
.source "PG"


# instance fields
.field private synthetic a:Lada;

.field private synthetic b:Landroid/widget/ListPopupWindow;

.field private synthetic c:Lacb;


# direct methods
.method constructor <init>(Lacb;Lada;Landroid/widget/ListPopupWindow;)V
    .locals 0

    .prologue
    .line 1743
    iput-object p1, p0, Lacn;->c:Lacb;

    iput-object p2, p0, Lacn;->a:Lada;

    iput-object p3, p0, Lacn;->b:Landroid/widget/ListPopupWindow;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 1743
    .line 3746
    iget-object v0, p0, Lacn;->c:Lacb;

    iget-object v1, p0, Lacn;->a:Lada;

    invoke-static {v0, v1}, Lacb;->a(Lacb;Lada;)Landroid/widget/ListAdapter;

    move-result-object v0

    .line 1743
    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, -0x1

    .line 1743
    check-cast p1, Landroid/widget/ListAdapter;

    .line 2751
    iget-object v0, p0, Lacn;->c:Lacb;

    invoke-static {v0}, Lacb;->k(Lacb;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2754
    iget-object v0, p0, Lacn;->c:Lacb;

    invoke-virtual {v0}, Lacb;->getLayout()Landroid/text/Layout;

    move-result-object v0

    iget-object v1, p0, Lacn;->c:Lacb;

    iget-object v2, p0, Lacn;->a:Lada;

    invoke-static {v1, v2}, Lacb;->b(Lacb;Lada;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v0

    .line 2755
    iget-object v1, p0, Lacn;->c:Lacb;

    invoke-static {v1, v0}, Lacb;->b(Lacb;I)I

    move-result v1

    .line 2759
    iget-object v2, p0, Lacn;->b:Landroid/widget/ListPopupWindow;

    iget-object v0, p0, Lacn;->c:Lacb;

    invoke-static {v0}, Lacb;->l(Lacb;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2760
    iget-object v0, p0, Lacn;->c:Lacb;

    invoke-static {v0}, Lacb;->l(Lacb;)Landroid/view/View;

    move-result-object v0

    .line 2759
    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/ListPopupWindow;->setAnchorView(Landroid/view/View;)V

    .line 2761
    iget-object v0, p0, Lacn;->b:Landroid/widget/ListPopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setVerticalOffset(I)V

    .line 2762
    iget-object v0, p0, Lacn;->b:Landroid/widget/ListPopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2763
    iget-object v0, p0, Lacn;->b:Landroid/widget/ListPopupWindow;

    iget-object v1, p0, Lacn;->c:Lacb;

    invoke-static {v1}, Lacb;->m(Lacb;)Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 2765
    iget-object v0, p0, Lacn;->c:Lacb;

    invoke-static {v0, v3}, Lacb;->c(Lacb;I)I

    .line 2766
    iget-object v0, p0, Lacn;->b:Landroid/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->show()V

    .line 2767
    iget-object v0, p0, Lacn;->b:Landroid/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->getListView()Landroid/widget/ListView;

    move-result-object v0

    .line 2768
    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 2773
    iget-object v1, p0, Lacn;->c:Lacb;

    invoke-static {v1}, Lacb;->n(Lacb;)I

    move-result v1

    if-eq v1, v3, :cond_0

    .line 2774
    iget-object v1, p0, Lacn;->c:Lacb;

    invoke-static {v1}, Lacb;->n(Lacb;)I

    move-result v1

    invoke-virtual {v0, v1, v4}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 2775
    iget-object v0, p0, Lacn;->c:Lacb;

    invoke-static {v0, v3}, Lacb;->c(Lacb;I)I

    .line 1743
    :cond_0
    return-void

    .line 2760
    :cond_1
    iget-object v0, p0, Lacn;->c:Lacb;

    goto :goto_0
.end method
