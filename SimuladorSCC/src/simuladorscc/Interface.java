/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorscc;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author mig
 */
public class Interface extends javax.swing.JFrame {
    ArrayList<String> listaDados = new ArrayList<>();

    public Interface() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        initComponents();
        Simular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaDados.add(tempo_simulacao.getText());
                listaDados.add(intervalo_clientes.getText());
                listaDados.add(tempo_servico_gasolina.getText());
                listaDados.add(tempo_servico_gasoleo.getText());
                listaDados.add(tempo_servico_loja.getText());
                listaDados.add(desvio_gasolina.getText());
                listaDados.add(desvio_gasoleo.getText());
                listaDados.add(desvio_loja.getText());
                listaDados.add(n_empregados_gasolina.getText());
                listaDados.add(n_empregados_gasoleo.getText());
                listaDados.add(n_empregados_loja.getText());
                
                try {
                    for(int i=0;i<listaDados.size();i++)
                        Double.parseDouble(listaDados.get(i));
                } catch (Exception exp) {
                    JOptionPane.showMessageDialog(null, "Parametros invalidos. Tente novamente.");
                }
                
                Simulador s = new Simulador(listaDados, 1);
                s.executa();
                
                String resultados = s.relat();
                JOptionPane.showMessageDialog(null, resultados, "Resultados Cenario 1", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
       
    protected void refresh() {
        this.revalidate();
    }
    
    public static void initInterface() {
        Interface I = new Interface();
        I.setResizable(false);
        I.setTitle("Simulador Bombas de Gasolina");
        //setContentPane(I);
        I.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        I.pack();
        I.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Simular = new javax.swing.JButton();
        Panel_Gasolina = new javax.swing.JPanel();
        titulo_gasolina = new javax.swing.JLabel();
        label_tempo_servico_gasolina = new javax.swing.JLabel();
        label_desvio_gasolina = new javax.swing.JLabel();
        label_empregados_gasolina = new javax.swing.JLabel();
        tempo_servico_gasolina = new javax.swing.JTextField();
        desvio_gasolina = new javax.swing.JTextField();
        n_empregados_gasolina = new javax.swing.JTextField();
        Panel_Gasoleo = new javax.swing.JPanel();
        titulo_gasoleo = new javax.swing.JLabel();
        label_tempo_servico_gasoleo = new javax.swing.JLabel();
        label_desvio_gasoleo = new javax.swing.JLabel();
        label_empregados_gasoleo = new javax.swing.JLabel();
        tempo_servico_gasoleo = new javax.swing.JTextField();
        desvio_gasoleo = new javax.swing.JTextField();
        n_empregados_gasoleo = new javax.swing.JTextField();
        Panel_Loja = new javax.swing.JPanel();
        titulo_loja = new javax.swing.JLabel();
        label_tempo_servico_loja = new javax.swing.JLabel();
        label_desvio_loja = new javax.swing.JLabel();
        label_empregados_loja = new javax.swing.JLabel();
        tempo_servico_loja = new javax.swing.JTextField();
        desvio_loja = new javax.swing.JTextField();
        n_empregados_loja = new javax.swing.JTextField();
        Panel_Cenarios = new javax.swing.JPanel();
        cenario1 = new javax.swing.JButton();
        cenario2 = new javax.swing.JButton();
        label_tempo_sim = new javax.swing.JLabel();
        label_chegada_clientes = new javax.swing.JLabel();
        tempo_simulacao = new javax.swing.JTextField();
        intervalo_clientes = new javax.swing.JTextField();

        Simular.setText("SIMULAR");
        Simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimularActionPerformed(evt);
            }
        });

        Panel_Gasolina.setPreferredSize(new java.awt.Dimension(250, 250));

        titulo_gasolina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo_gasolina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_gasolina.setText("- GASOLINA -");

        label_tempo_servico_gasolina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_tempo_servico_gasolina.setText("Tempo Medio de Servico:");

        label_desvio_gasolina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_desvio_gasolina.setText("Desvio Padrao:");

        label_empregados_gasolina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_empregados_gasolina.setText("Nº Empregados:");

        javax.swing.GroupLayout Panel_GasolinaLayout = new javax.swing.GroupLayout(Panel_Gasolina);
        Panel_Gasolina.setLayout(Panel_GasolinaLayout);
        Panel_GasolinaLayout.setHorizontalGroup(
            Panel_GasolinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_GasolinaLayout.createSequentialGroup()
                .addGroup(Panel_GasolinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_GasolinaLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(titulo_gasolina))
                    .addGroup(Panel_GasolinaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_GasolinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_desvio_gasolina)
                            .addComponent(label_tempo_servico_gasolina)
                            .addComponent(label_empregados_gasolina))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_GasolinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempo_servico_gasolina, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(desvio_gasolina)
                            .addComponent(n_empregados_gasolina))))
                .addContainerGap())
        );
        Panel_GasolinaLayout.setVerticalGroup(
            Panel_GasolinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_GasolinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_gasolina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_GasolinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tempo_servico_gasolina)
                    .addComponent(tempo_servico_gasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_GasolinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_desvio_gasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desvio_gasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_GasolinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_empregados_gasolina)
                    .addComponent(n_empregados_gasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        Panel_Gasoleo.setPreferredSize(new java.awt.Dimension(250, 250));

        titulo_gasoleo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo_gasoleo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_gasoleo.setText("- GASOLEO -");

        label_tempo_servico_gasoleo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_tempo_servico_gasoleo.setText("Tempo Medio de Servico:");

        label_desvio_gasoleo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_desvio_gasoleo.setText("Desvio Padrao:");

        label_empregados_gasoleo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_empregados_gasoleo.setText("Nº Empregados:");

        javax.swing.GroupLayout Panel_GasoleoLayout = new javax.swing.GroupLayout(Panel_Gasoleo);
        Panel_Gasoleo.setLayout(Panel_GasoleoLayout);
        Panel_GasoleoLayout.setHorizontalGroup(
            Panel_GasoleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_GasoleoLayout.createSequentialGroup()
                .addGroup(Panel_GasoleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_GasoleoLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(titulo_gasoleo))
                    .addGroup(Panel_GasoleoLayout.createSequentialGroup()
                        .addGroup(Panel_GasoleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_desvio_gasoleo)
                            .addComponent(label_tempo_servico_gasoleo)
                            .addComponent(label_empregados_gasoleo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_GasoleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempo_servico_gasoleo, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(desvio_gasoleo)
                            .addComponent(n_empregados_gasoleo))))
                .addContainerGap())
        );
        Panel_GasoleoLayout.setVerticalGroup(
            Panel_GasoleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_GasoleoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_gasoleo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_GasoleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tempo_servico_gasoleo)
                    .addComponent(tempo_servico_gasoleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(Panel_GasoleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_desvio_gasoleo)
                    .addComponent(desvio_gasoleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_GasoleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_empregados_gasoleo)
                    .addComponent(n_empregados_gasoleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        Panel_Loja.setPreferredSize(new java.awt.Dimension(250, 250));

        titulo_loja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo_loja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_loja.setText("- LOJA -");

        label_tempo_servico_loja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_tempo_servico_loja.setText("Tempo Medio de Servico:");

        label_desvio_loja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_desvio_loja.setText("Desvio Padrao:");

        label_empregados_loja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_empregados_loja.setText("Nº Empregados:");

        javax.swing.GroupLayout Panel_LojaLayout = new javax.swing.GroupLayout(Panel_Loja);
        Panel_Loja.setLayout(Panel_LojaLayout);
        Panel_LojaLayout.setHorizontalGroup(
            Panel_LojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LojaLayout.createSequentialGroup()
                .addGroup(Panel_LojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_empregados_loja)
                    .addComponent(label_desvio_loja)
                    .addComponent(label_tempo_servico_loja))
                .addGap(10, 10, 10)
                .addGroup(Panel_LojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempo_servico_loja, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(desvio_loja)
                    .addComponent(n_empregados_loja))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LojaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo_loja)
                .addGap(101, 101, 101))
        );
        Panel_LojaLayout.setVerticalGroup(
            Panel_LojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LojaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_loja)
                .addGap(11, 11, 11)
                .addGroup(Panel_LojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tempo_servico_loja)
                    .addComponent(tempo_servico_loja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_LojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_desvio_loja)
                    .addComponent(desvio_loja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(Panel_LojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_empregados_loja)
                    .addComponent(n_empregados_loja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cenario1.setText("CENARIO 1");
        cenario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenario1ActionPerformed(evt);
            }
        });

        cenario2.setText("CENARIO 2");
        cenario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenario2ActionPerformed(evt);
            }
        });

        label_tempo_sim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_tempo_sim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tempo_sim.setText("Tempo de Simulacao:");
        label_tempo_sim.setToolTipText("");

        label_chegada_clientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_chegada_clientes.setText("Intervalo de chegada dos clientes:");

        tempo_simulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempo_simulacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_CenariosLayout = new javax.swing.GroupLayout(Panel_Cenarios);
        Panel_Cenarios.setLayout(Panel_CenariosLayout);
        Panel_CenariosLayout.setHorizontalGroup(
            Panel_CenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CenariosLayout.createSequentialGroup()
                .addGroup(Panel_CenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_CenariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cenario1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cenario2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_CenariosLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(Panel_CenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_chegada_clientes)
                            .addComponent(label_tempo_sim))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_CenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tempo_simulacao, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(intervalo_clientes))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_CenariosLayout.setVerticalGroup(
            Panel_CenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CenariosLayout.createSequentialGroup()
                .addGroup(Panel_CenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cenario1)
                    .addComponent(cenario2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_CenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tempo_sim)
                    .addComponent(tempo_simulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_CenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_chegada_clientes)
                    .addComponent(intervalo_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panel_Gasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel_Gasoleo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Simular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel_Loja, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_Cenarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Panel_Cenarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel_Gasolina, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panel_Gasoleo, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Simular, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(Panel_Loja, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cenario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cenario1ActionPerformed

    private void cenario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cenario2ActionPerformed

    private void tempo_simulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempo_simulacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempo_simulacaoActionPerformed

    private void SimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimularActionPerformed
        
    }//GEN-LAST:event_SimularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Cenarios;
    private javax.swing.JPanel Panel_Gasoleo;
    private javax.swing.JPanel Panel_Gasolina;
    private javax.swing.JPanel Panel_Loja;
    private javax.swing.JButton Simular;
    private javax.swing.JButton cenario1;
    private javax.swing.JButton cenario2;
    private javax.swing.JTextField desvio_gasoleo;
    private javax.swing.JTextField desvio_gasolina;
    private javax.swing.JTextField desvio_loja;
    private javax.swing.JTextField intervalo_clientes;
    private javax.swing.JLabel label_chegada_clientes;
    private javax.swing.JLabel label_desvio_gasoleo;
    private javax.swing.JLabel label_desvio_gasolina;
    private javax.swing.JLabel label_desvio_loja;
    private javax.swing.JLabel label_empregados_gasoleo;
    private javax.swing.JLabel label_empregados_gasolina;
    private javax.swing.JLabel label_empregados_loja;
    private javax.swing.JLabel label_tempo_servico_gasoleo;
    private javax.swing.JLabel label_tempo_servico_gasolina;
    private javax.swing.JLabel label_tempo_servico_loja;
    private javax.swing.JLabel label_tempo_sim;
    private javax.swing.JTextField n_empregados_gasoleo;
    private javax.swing.JTextField n_empregados_gasolina;
    private javax.swing.JTextField n_empregados_loja;
    private javax.swing.JTextField tempo_servico_gasoleo;
    private javax.swing.JTextField tempo_servico_gasolina;
    private javax.swing.JTextField tempo_servico_loja;
    private javax.swing.JTextField tempo_simulacao;
    private javax.swing.JLabel titulo_gasoleo;
    private javax.swing.JLabel titulo_gasolina;
    private javax.swing.JLabel titulo_loja;
    // End of variables declaration//GEN-END:variables
    
}
